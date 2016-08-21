package com.tradesniffer.session.impl;

import com.tradesniffer.dao.PaisDAO;
import com.tradesniffer.dao.ProdutoDAO;
import com.tradesniffer.entity.Produto;
import com.tradesniffer.session.ProdutoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Headtrap on 21-Aug-16.
 */

@Component
@Service
@Transactional
public class ProdutoSessionImpl implements ProdutoSession {

    @Autowired
    public ProdutoDAO produtoDAO;

    @Override
    public List<Produto> getProdutos() {

        try {
            return produtoDAO.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
