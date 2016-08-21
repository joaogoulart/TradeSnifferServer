package com.tradesniffer.entity;

import javax.persistence.Column;
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
public class Produto {

    @Column
    public String descricao;
    @Id
    private Long ncm;

    @Id
    public Long getNcm() {
        return ncm;
    }

    public void setNcm(Long ncm) {
        this.ncm = ncm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
