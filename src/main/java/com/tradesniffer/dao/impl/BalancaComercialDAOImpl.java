package com.tradesniffer.dao.impl;

import com.tradesniffer.dao.BalancaComercialDAO;
import com.tradesniffer.entity.BalancaComercial;

public class BalancaComercialDAOImpl extends GenericDAOImpl<BalancaComercial, Long> implements BalancaComercialDAO {

    public BalancaComercialDAOImpl() {
        super(BalancaComercial.class);
    }

}