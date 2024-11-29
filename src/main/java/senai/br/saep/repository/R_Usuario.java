package senai.br.saep.repository;


import com.senai.pr.saep.model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    // Aqui podemos adicionar métodos específicos, caso seja necessário
}

