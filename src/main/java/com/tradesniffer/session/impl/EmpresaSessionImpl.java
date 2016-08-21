package com.tradesniffer.session.impl;

import com.tradesniffer.dao.EmpresaDAO;
import com.tradesniffer.dao.PaisDAO;
import com.tradesniffer.entity.Empresas;
import com.tradesniffer.entity.Pais;
import com.tradesniffer.session.EmpresaSesssion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joao_ on 21/08/2016.
 */
@Component
@Service
@Transactional
public class EmpresaSessionImpl implements EmpresaSesssion {

    @Autowired
    public EmpresaDAO empresaDAO;

    @Autowired
    public PaisDAO paisDAO;

    @Override
    public List<Empresas> getEmpresasByPais(Long idPais) throws Exception {
        Pais pais = paisDAO.find(idPais);
        if (pais != null) {
            List<Empresas> empresasByPais = empresaDAO.getEmpresasByPais(pais);
            return empresasByPais;
        }
        return null;
    }
}
