package com.tradesniffer.dao.impl;

import com.tradesniffer.dao.ProdutoDAO;
import com.tradesniffer.entity.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Headtrap on 21-Aug-16.
 */

@Repository
@Transactional
@EnableTransactionManagement
public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Long> implements ProdutoDAO {

    public ProdutoDAOImpl() {
        super(Produto.class);
    }

}
