package com.multsaude.gestaosaude.dominio.vaga;

import com.multsaude.gestaosaude.infra.login.Vaga;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VagaService {

    public ResponseEntity<?> salvarVaga(VagaDto dto);

    public List<Vaga> listarVaga();
}
