package com.tradesniffer.service;

import com.tradesniffer.dto.BalancaDTO;
import com.tradesniffer.entity.Produto;
import com.tradesniffer.session.PaisSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by joao_ on 20/08/2016.
 */
@Path("/pais")
@Component
public class PaisService {

    @Autowired
    public PaisSession paisSession;

    @POST
    @Path("/getRankingPaises")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public BalancaDTO getRankingPaises(Produto produto) {
        return paisSession.getRankingPaises(produto);
    }
}
