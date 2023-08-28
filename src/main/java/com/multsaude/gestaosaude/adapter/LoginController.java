package com.multsaude.gestaosaude.adapter;

import com.multsaude.gestaosaude.dominio.login.LoginEntity;
import com.multsaude.gestaosaude.dominio.vaga.CadastroVagaDto;
import com.multsaude.gestaosaude.infra.login.LoginRepositoryJpaIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    LoginRepositoryJpaIml loginService;

    @GetMapping("/")
    public String Login(){
        return "login";
    }

    @PostMapping ("/login")
    public ModelAndView logar(LoginEntity login) throws Exception {

        ModelAndView view = new ModelAndView("home");

        view.addObject("vaga", new CadastroVagaDto());

        return view;

    }
}
