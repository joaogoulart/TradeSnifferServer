package com.tradesniffer.service;

import com.tradesniffer.entity.Produto;
import com.tradesniffer.session.ProdutoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Headtrap on 20-Aug-16.
 */

@Path("/produto")
@Component
public class ProdutosService {

    @Autowired
    public ProdutoSession produtoSession;

    @GET
    @Path("/getProdutos")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Produto> getProdutos (){
      return produtoSession.getProdutos();
    }

}
