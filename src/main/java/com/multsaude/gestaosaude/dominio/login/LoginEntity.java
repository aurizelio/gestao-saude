package com.multsaude.gestaosaude.dominio.login;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="tb_login")
public class LoginEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usuario;

    private  String senha;


}
