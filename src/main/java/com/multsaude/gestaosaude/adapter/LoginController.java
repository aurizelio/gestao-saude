package com.multsaude.gestaosaude.adapter;
import com.multsaude.gestaosaude.dominio.login.Usuario;
import com.multsaude.gestaosaude.aplicacao.login.ValidaUsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    ValidaUsuarioImpl service;

    @GetMapping("/")
    public String Login(){
        return "login/home";
    }

    @PostMapping ("login/logar")
    public ModelAndView home(Usuario usuario){
        boolean usuarioSenhaValido = service.verificaUser(usuario.getEmail(),usuario.getSenha());
        ModelAndView view =  new ModelAndView("login/home");
        if(usuarioSenhaValido){
            view = new ModelAndView("index");
            return view;
        }
        return  view;
    }
}
