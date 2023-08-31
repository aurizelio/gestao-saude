package com.multsaude.gestaosaude.adapter;

import com.multsaude.gestaosaude.aplicacao.vaga.SalvarServiceImpl;
import com.multsaude.gestaosaude.dominio.vaga.VagaDto;
import com.multsaude.gestaosaude.infra.login.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("vaga")
public class VagaController {

    @Autowired
    SalvarServiceImpl service;
    @GetMapping("/cadastrar")
    public String cadastrarVaga(){
        return "vaga/cadastrar";
    }

    @PostMapping("/salvar")
    public String salcarVaga(VagaDto vaga){
        vaga.setStatus(true);
        service.salvarVaga(vaga);
        return "home";
    }

    @GetMapping("/lista-vagas")
    public ModelAndView listarVagas(){
        List<Vaga> vagas = service.listarVaga();
        ModelAndView view = new ModelAndView("lista-vagas");
        view.addObject("vagas",vagas);
        return view;
    }
}
