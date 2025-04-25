package com.assinatura.assinatura.records;

public record UsuarioResponsePostRecord(Long id, String nome, String email, String telefone) {
    public UsuarioResponsePostRecord(com.assinatura.assinatura.Model.Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getTelefone());
    }

}
