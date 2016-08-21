package com.tradesniffer.dao.impl;

import com.tradesniffer.dao.EmpresaDAO;
import com.tradesniffer.entity.Empresas;
import com.tradesniffer.entity.Pais;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joao_ on 21/08/2016.
 */
@Repository
@Transactional
@EnableTransactionManagement
public class EmpresaDAOImpl extends GenericDAOImpl<Empresas, Long> implements EmpresaDAO {

    public EmpresaDAOImpl() {
        super(Empresas.class);
    }

    @Override
    public List<Empresas> getEmpresasByPais(Pais pais) {
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT  ");
        sb.append("     e   ");
        sb.append(" FROM  ");
        sb.append("     Empresas e ");
        sb.append(" WHERE ");
        sb.append("     e.pais = :pais ");

        Query query = getSession().createQuery(sb.toString());
        query.setParameter("pais", pais);

        return query.list();
    }
}
