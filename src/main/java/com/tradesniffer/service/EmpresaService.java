package com.tradesniffer.service;

import com.tradesniffer.entity.Empresas;
import com.tradesniffer.session.EmpresaSesssion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by joao_ on 21/08/2016.
 */
@Path("/empresas")
@Component
public class EmpresaService {

    @Autowired
    public EmpresaSesssion empresaSesssion;

    @GET
    @Path("/getEmpresasByPais/{id_pais}")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Empresas> getEmpresasByPais(@PathParam("id_pais") Long idPais) throws Exception {
        return empresaSesssion.getEmpresasByPais(idPais);
    }

}
