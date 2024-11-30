package com.senai.br.saep.controller;

import com.senai.br.saep.model.M_Usuario;
import com.senai.br.saep.service.S_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class C_Usuario {

    @Autowired
    private S_Usuario sUsuario;
    
    @GetMapping("/cadastro")
    public String mostrarCadastro(Model model) {
        return "cadastro";
    }

    // Endpoint para processar o cadastro
    @PostMapping("/cadastro")
    public String cadastrarUsuario(@ModelAttribute M_Usuario usuario, Model model) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty() ||
                usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
            model.addAttribute("erro", "Nome e email são obrigatórios!");
            return "cadastro"; // retorna para o formulário com erro
        }

        M_Usuario usuarioSalvo = sUsuario.salvarUsuario(usuario);
        model.addAttribute("usuario", usuarioSalvo);
        return "cadastro/cadastro"; // página de sucesso, você deve criar essa página
    }
}
