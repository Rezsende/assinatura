package com.assinatura.assinatura.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @GetMapping("/Lista")
    public String TodosUsuarios() {
        return "Lista";
    }
}
