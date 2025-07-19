package com.assinatura.assinatura.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;
    private String senha;
    private String telefone;

//    @ManyToOne
//    @JoinColumn(name = "plano_id")
//    private Plano plano;

}
