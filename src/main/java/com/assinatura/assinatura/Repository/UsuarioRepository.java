package com.assinatura.assinatura.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assinatura.assinatura.Model.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByNome(String nome);
}
