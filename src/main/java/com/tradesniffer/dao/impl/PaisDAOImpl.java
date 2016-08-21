package com.tradesniffer.dao.impl;

import com.tradesniffer.dao.PaisDAO;
import com.tradesniffer.entity.BalancaComercial;
import com.tradesniffer.entity.Pais;
import com.tradesniffer.entity.Produto;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joao_ on 20/08/2016.
 */
@Repository
@Transactional
@EnableTransactionManagement
public class PaisDAOImpl extends GenericDAOImpl<Pais, Long> implements PaisDAO {

    public PaisDAOImpl() {
        super(Pais.class);
    }

    @Override
    public List<BalancaComercial> getPaisesImportByProduto(Produto produto, String tipo) {
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT  ");
        sb.append("     b   ");
        sb.append(" FROM  ");
        sb.append("     BalancaComercial b ");
        sb.append(" WHERE ");
        sb.append("     b.tipo = :tipo ");
        sb.append(" AND ");
        sb.append("     b.produto = :produto ");
        sb.append("     ORDER BY b.valorTotal DESC");

        Query query = getSession().createQuery(sb.toString());
        query.setParameter("produto", produto);
        query.setParameter("tipo", tipo);

        return query.list();
    }
}
