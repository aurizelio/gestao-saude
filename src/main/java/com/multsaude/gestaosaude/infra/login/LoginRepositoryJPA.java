package com.multsaude.gestaosaude.infra.login;

import com.multsaude.gestaosaude.dominio.login.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface LoginRepositoryJPA extends JpaRepository<LoginEntity, Long> {
    Optional<LoginEntity> findByUsuario(String username);

}

