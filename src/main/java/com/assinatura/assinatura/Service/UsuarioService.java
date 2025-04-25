package com.assinatura.assinatura.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assinatura.assinatura.Model.Usuario;
import com.assinatura.assinatura.Repository.UsuarioRepository;
import com.assinatura.assinatura.records.UsuarioRecord;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {

        Optional<Usuario> obj = repository.findById(id);
        return obj.get();
    }

    public Usuario save(UsuarioRecord usuario) {

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(usuario.nome());
        novoUsuario.setEmail(usuario.email());
        novoUsuario.setSenha(usuario.senha());
        novoUsuario.setTelefone(usuario.telefone());

        return repository.save(novoUsuario);
    }

    public void delete(Long id) {
        Usuario usuario = findById(id);
        repository.delete(usuario);
    }

}
