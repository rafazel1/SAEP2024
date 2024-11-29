package senai.br.saep.controller;


import com.senai.pr.saep.model.M_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import senai.br.saep.service.S_Usuario;

@Controller
public class C_Usuario {

    @Autowired
    private S_Usuario sUsuario;


    @GetMapping("/cadastro")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("usuario", new M_Usuario());
        return "cadastro";
    }

    // Processa o cadastro do usuário
    @PostMapping("/cadastro")
    public String cadastrarUsuario(@ModelAttribute("usuario") M_Usuario usuario) {
        sUsuario.salvarUsuario(usuario);
        return "redirect:/sucesso";
    }
}
