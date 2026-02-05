package com.exemplo.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class HelloController {

    private List<Map<String, String>> usuarios = new ArrayList<>();

    @GetMapping("/")
    public String root() {
        return "Bem-vindo à aplicação!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot funcionando com sucesso!";
    }

    @GetMapping("/usuarios")
    public List<Map<String, String>> getUsuarios() {
        return usuarios;
    }

    @PostMapping("/usuarios")
    public Map<String, String> createUsuario(@RequestBody Map<String, String> usuario) {
        usuarios.add(usuario);
        return usuario;
    }
}
