package com.senai.br.saep.controller;

import com.senai.br.saep.model.M_Usuario;
import com.senai.br.saep.service.S_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class C_Usuario {

    @Autowired
    private S_Usuario sUsuario;

    @PostMapping("/cadastro")
    public ResponseEntity<M_Usuario> cadastrarUsuario(@RequestBody M_Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty() ||
                usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        M_Usuario usuarioSalvo = sUsuario.salvarUsuario(usuario);
        return ResponseEntity.ok(usuarioSalvo);
    }
}
