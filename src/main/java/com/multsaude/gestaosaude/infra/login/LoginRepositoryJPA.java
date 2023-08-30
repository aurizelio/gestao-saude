package com.multsaude.gestaosaude.infra.login;

import com.multsaude.gestaosaude.dominio.login.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface LoginRepositoryJPA extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

}

