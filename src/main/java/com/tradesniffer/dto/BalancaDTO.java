package com.tradesniffer.dto;

import com.tradesniffer.entity.BalancaComercial;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by joao_ on 20/08/2016.
 */
@XmlRootElement
public class BalancaDTO {

    public List<BalancaComercial> listImportacao;
    public List<BalancaComercial> listExportacao;

}
