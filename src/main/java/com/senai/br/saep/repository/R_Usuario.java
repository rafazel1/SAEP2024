package com.senai.br.saep.repository;

import com.senai.br.saep.model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, String> {
    // Métodos adicionais, se necessário
}
