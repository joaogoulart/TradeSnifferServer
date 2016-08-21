package com.tradesniffer.session;

import com.tradesniffer.dto.BalancaDTO;
import com.tradesniffer.entity.Produto;

/**
 * Created by joao_ on 20/08/2016.
 */
public interface PaisSession {

    public BalancaDTO getRankingPaises(Produto produto);
}
