package com.senai.br.saep.service;

import com.senai.br.saep.model.M_Usuario;
import com.senai.br.saep.repository.R_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Usuario {

    @Autowired
    private R_Usuario rUsuario;

    public M_Usuario salvarUsuario(M_Usuario usuario) {
        return rUsuario.save(usuario);
    }
}
