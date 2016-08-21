package com.tradesniffer.session.impl;

import com.tradesniffer.dao.PaisDAO;
import com.tradesniffer.dto.BalancaDTO;
import com.tradesniffer.entity.BalancaComercial;
import com.tradesniffer.session.PaisSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public BalancaDTO getRankingPaises(Long produto) {
        if (produto != null) {
            BalancaDTO balancaDTO = new BalancaDTO();
            List<BalancaComercial> balancaComercialListImport = paisDAO.getPaisesImportByProduto(produto, "IMPORTAÇÕES");
            List<BalancaComercial> listA = new ArrayList<>();
            if (balancaComercialListImport.size() > 0) {
                for (int i = 0; i < 3; i++) {
                    listA.add(balancaComercialListImport.get(i));
                }
            }
            List<BalancaComercial> balancaComercialListExport = paisDAO.getPaisesImportByProduto(produto, "EXPORTAÇÕES");
            List<BalancaComercial> listB = new ArrayList<>();
            if (balancaComercialListExport.size() > 0) {
                for (int i = 0; i < 3; i++) {
                    listB.add(balancaComercialListExport.get(i));
                }
            }

            balancaDTO.listImportacao = listA;
            balancaDTO.listExportacao = listB;
            return balancaDTO;
        }
        return null;
    }
}
