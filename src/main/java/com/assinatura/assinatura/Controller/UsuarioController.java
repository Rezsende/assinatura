package com.assinatura.assinatura.Controller;
import com.assinatura.assinatura.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import com.assinatura.assinatura.Model.Usuario;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
       usuarioRepository.save(usuario);
       return  usuario;
    }
    @GetMapping("{id}")
    public  Usuario searchById(@PathVariable("id") Long id){
       return  usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado com ID: " + id));
    }
    @DeleteMapping("{id}")
    public  void deleteUser(@PathVariable("id") Long id){
        usuarioRepository.deleteById(id);
    }
    @PutMapping("{id}")
    public  void updateUser(@PathVariable("id") Long id, @RequestBody Usuario usuario){
        usuario.setId(id);
        usuarioRepository.save(usuario);
    }
    @GetMapping
    public List<Usuario> search(@RequestParam("nome") String nome){
        return usuarioRepository.findByNome(nome);
       }
}
