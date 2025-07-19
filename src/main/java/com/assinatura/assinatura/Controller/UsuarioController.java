package com.assinatura.assinatura.Controller;
import com.assinatura.assinatura.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assinatura.assinatura.Model.Usuario;

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
}
