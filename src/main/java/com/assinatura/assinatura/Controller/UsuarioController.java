package com.assinatura.assinatura.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assinatura.assinatura.Model.Usuario;
import com.assinatura.assinatura.Service.UsuarioService;
import com.assinatura.assinatura.records.CustomResponseRecord;
import com.assinatura.assinatura.records.UsuarioRecord;
import com.assinatura.assinatura.records.UsuarioResponsePostRecord;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioResponsePostRecord> findAlls() {
        return service.findAll().stream().map(UsuarioResponsePostRecord::new).toList();

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        try {
            Usuario usuario = service.findById(id);
            UsuarioResponsePostRecord response = new UsuarioResponsePostRecord(usuario);
            return ResponseEntity.ok(response);

        } catch (NoSuchElementException e) {
            CustomResponseRecord response = new CustomResponseRecord(404, "Usuário não encontrado!");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    @PostMapping
    public ResponseEntity<CustomResponseRecord> create(@RequestBody UsuarioRecord usuario) {
        service.save(usuario);
        CustomResponseRecord response = new CustomResponseRecord(201, "Usuário criado com sucesso!");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponseRecord> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            CustomResponseRecord response = new CustomResponseRecord(200, "Usuário deletado com sucesso!");
            return ResponseEntity.ok(response);
        } catch (NoSuchElementException e) {
            CustomResponseRecord response = new CustomResponseRecord(404, "Usuário não encontrado!");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }
}
