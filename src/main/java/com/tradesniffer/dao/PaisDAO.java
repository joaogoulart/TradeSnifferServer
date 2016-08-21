package com.tradesniffer.dao;

import com.tradesniffer.entity.BalancaComercial;
import com.tradesniffer.entity.Pais;
import com.tradesniffer.entity.Produto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by joao_ on 20/08/2016.
 */
@Repository
public interface PaisDAO extends GenericDAO <Pais, Long> {

    List<BalancaComercial> getPaisesImportByProduto(Produto produto, String tipo);
}
