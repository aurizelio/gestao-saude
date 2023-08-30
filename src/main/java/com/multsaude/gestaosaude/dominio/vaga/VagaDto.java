package com.multsaude.gestaosaude.dominio.vaga;

import com.multsaude.gestaosaude.infra.login.Vaga;

public class VagaDto {

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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPlantao() {
        return plantao;
    }

    public void setPlantao(String plantao) {
        this.plantao = plantao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getRegiao() {
        return regiao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Vaga criarVaga(){
        return new Vaga(
                this.descricao,
                this.horario,
                this.plantao,
                this.endereco,
                this.cep,
                this.regiao,
                this.cidade,
                this.estado,
                this.referencia,
                this.paciente,
                this.observacao,
                this.status
        );


    }
}
