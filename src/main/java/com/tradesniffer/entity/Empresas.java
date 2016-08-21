package com.tradesniffer.entity;

/**
 * Created by joao_ on 20/08/2016.
 */

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Table
@Entity
@XmlRootElement
public class Empresas {

    //ID,NOME,PAIS,PRODUTO,CIDADE,TELEFONE,LAT,LNG
    @Column
    public String nome;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "id")
    public Pais pais;

    @Column
    public String produto;

    @Column
    public String cidade;

    @Column
    public String telefone;

    @Column
    public double lat;

    @Column
    public double lng;

    @Id
    private Long id;

    public Empresas() {
    }

    public Empresas(String nome, Pais pais, String produto, String cidade, String telefone, double lat, double lng) {
        this.nome = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.telefone = telefone;
        this.lat = lat;
        this.lng = lng;
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
