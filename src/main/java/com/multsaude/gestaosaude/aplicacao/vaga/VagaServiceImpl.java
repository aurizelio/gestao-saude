package com.multsaude.gestaosaude.aplicacao.vaga;


import com.multsaude.gestaosaude.dominio.vaga.VagaService;
import com.multsaude.gestaosaude.dominio.vaga.VagaDto;
import com.multsaude.gestaosaude.infra.login.Vaga;
import com.multsaude.gestaosaude.infra.vaga.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaServiceImpl implements VagaService {

    @Autowired
    VagaRepository repository;
    @Override
    public ResponseEntity<?> salvarVaga(VagaDto dto) {
       Vaga vaga=  repository.save(dto.criarVaga());
        return  new ResponseEntity<>(vaga, HttpStatus.OK);
    }

    @Override
    public List<Vaga> listarVaga() {
       return repository.findAll();
    }
}
