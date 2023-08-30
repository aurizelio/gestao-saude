package com.multsaude.gestaosaude.infra.vaga;

import com.multsaude.gestaosaude.infra.login.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository  extends JpaRepository<Vaga, Long> {
}
