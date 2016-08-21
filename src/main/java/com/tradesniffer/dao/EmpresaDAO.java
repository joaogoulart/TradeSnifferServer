package com.tradesniffer.dao;

import com.tradesniffer.entity.Empresas;
import com.tradesniffer.entity.Pais;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by joao_ on 21/08/2016.
 */
@Repository
public interface EmpresaDAO extends GenericDAO<Empresas, Long> {

    public List<Empresas> getEmpresasByPais(Pais pais);

}
