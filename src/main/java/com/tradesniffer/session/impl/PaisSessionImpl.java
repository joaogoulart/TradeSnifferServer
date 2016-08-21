package com.tradesniffer.session.impl;

import com.tradesniffer.dao.PaisDAO;
import com.tradesniffer.dto.BalancaDTO;
import com.tradesniffer.entity.BalancaComercial;
import com.tradesniffer.entity.Produto;
import com.tradesniffer.session.PaisSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joao_ on 20/08/2016.
 */
@Component
@Service
@Transactional
public class PaisSessionImpl implements PaisSession {

    @Autowired
    public PaisDAO paisDAO;

    @Override
    public BalancaDTO getRankingPaises(Produto produto) {
        if (produto != null) {
            List<BalancaComercial> balancaComercialListImport = paisDAO.getPaisesImportByProduto(produto, "IMPORTAÇÕES");
            List<BalancaComercial> balancaComercialListExport = paisDAO.getPaisesImportByProduto(produto, "EXPORTAÇÕES");
            BalancaDTO balancaDTO = new BalancaDTO();
            balancaDTO.listImportacao = balancaComercialListImport;
            balancaDTO.listExportacao = balancaComercialListExport;
            return balancaDTO;
        }
        return null;
    }
}
