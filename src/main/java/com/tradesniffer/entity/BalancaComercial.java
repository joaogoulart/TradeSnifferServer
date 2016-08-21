package com.tradesniffer.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by joao_ on 20/08/2016.
 */
@Table
@Entity
@XmlRootElement
public class BalancaComercial {

    @Column
    public String tipo;

    @Column
    public String PERIODO;

    @Column
    public int coAno;

    @Column
    public String pais;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "ncm")
    public Long idProduto;

    @Column
    public String fatAgreg;

    @Column
    public String continente;

    @Column
    public int valorTotal;
    //TIPO	PERIODO	CO_ANO	NO_PAIS	NO_PPE_PPI	NO_FAT_AGREG	CONTINENTE	VL_FOB

    private Long id;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPERIODO() {
        return PERIODO;
    }

    public void setPERIODO(String PERIODO) {
        this.PERIODO = PERIODO;
    }

    public int getCoAno() {
        return coAno;
    }

    public void setCoAno(int coAno) {
        this.coAno = coAno;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String noPais) {
        this.pais = noPais;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long noPpePpi) {
        this.idProduto = noPpePpi;
    }

    public String getFatAgreg() {
        return fatAgreg;
    }

    public void setFatAgreg(String noFatAgreg) {
        this.fatAgreg = noFatAgreg;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int vlFob) {
        this.valorTotal = vlFob;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String relatorio) {
        this.continente = relatorio;
    }
}
