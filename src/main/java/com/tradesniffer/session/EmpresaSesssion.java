package com.tradesniffer.session;

import com.tradesniffer.entity.Empresas;
import com.tradesniffer.entity.Pais;

import java.util.List;

/**
 * Created by joao_ on 21/08/2016.
 */
public interface EmpresaSesssion {

    public List<Empresas> getEmpresasByPais(Long idPais) throws Exception;
}
