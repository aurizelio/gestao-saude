package com.multsaude.gestaosaude.dominio.login;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name="tb_login")
@Setter
@Getter
public class LoginEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usuario;

    private  String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
