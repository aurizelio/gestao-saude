package com.multsaude.gestaosaude.infra.login;

import com.multsaude.gestaosaude.dominio.login.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginRepositoryJpaIml {

    @Autowired
    LoginRepositoryJPA repository;

    public LoginEntity buscaUsuario(String usuario) throws Exception {
       return repository.findByUsuario(usuario).get();
    }
}
