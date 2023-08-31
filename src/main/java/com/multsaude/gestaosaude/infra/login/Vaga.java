package com.multsaude.gestaosaude.infra.login;

import com.multsaude.gestaosaude.dominio.vaga.VagaDto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Getter
@Setter
@Entity
public class Vaga {

    @Id
    @GeneratedValue
    private long id;

    private String descricao;

    private String horario;
    private String plantao;

    private String endereco;
    private String cep;

    private String regiao;

    private String cidade;

    private String estado;

    private String referencia;

    private String paciente;

    private String observacao;

    private boolean status;

    public Vaga() {
    }

    public Vaga(String descricao, String horario, String plantao, String endereco, String cep, String regiao,
                String cidade, String estado, String referencia, String paciente, String observacao, boolean status) {
        this.descricao = descricao;
        this.horario = horario;
        this.plantao = plantao;
        this.endereco = endereco;
        this.cep = cep;
        this.regiao = regiao;
        this.cidade = cidade;
        this.estado = estado;
        this.referencia = referencia;
        this.paciente = paciente;
        this.observacao = observacao;
        this.status = status;
    }
}
