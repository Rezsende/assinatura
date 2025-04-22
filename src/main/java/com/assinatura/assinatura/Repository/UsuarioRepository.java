package com.assinatura.assinatura.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assinatura.assinatura.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
