package senai.br.saep.service;


import com.senai.pr.saep.model.M_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.br.saep.repository.R_Usuario;

@Service
public class S_Usuario {

    @Autowired
    private R_Usuario rUsuario;

    public M_Usuario salvarUsuario(M_Usuario usuario) {
        // Aqui você pode adicionar validações ou outras lógicas de negócios
        return rUsuario.save(usuario);  // Salva o usuário no banco de dados
    }
}
