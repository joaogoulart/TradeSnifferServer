package com.tradesniffer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by joao_ on 20/08/2016.
 */
@Table
@Entity
@XmlRootElement
public class Pais {

    public String nome;

    public Pais(String nome) {
        this.nome = nome;
    }

    public Pais() {
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
