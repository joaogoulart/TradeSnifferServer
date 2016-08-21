package com.tradesniffer.session;

import com.tradesniffer.dto.BalancaDTO;

/**
 * Created by joao_ on 20/08/2016.
 */
public interface PaisSession {

    public BalancaDTO getRankingPaises(Long produto);
}
