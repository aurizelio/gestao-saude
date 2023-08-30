package com.multsaude.gestaosaude.dominio.login;

import org.springframework.stereotype.Service;

@Service
public interface ValidarUsuario {
    boolean verificaUser(String email, String senha);

}
