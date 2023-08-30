package com.multsaude.gestaosaude.aplicacao.login;

import com.multsaude.gestaosaude.dominio.login.Usuario;
import com.multsaude.gestaosaude.dominio.login.ValidarUsuario;
import com.multsaude.gestaosaude.infra.login.LoginRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidaUsuarioImpl implements ValidarUsuario {

    @Autowired
    LoginRepositoryJPA repository;

    @Override
    public boolean verificaUser(String email, String senha) {
        Optional<Usuario> usuario = repository.findByEmail(email);
        return usuario.map(value -> value.getSenha().equals(senha)).orElse(false);
    }
}