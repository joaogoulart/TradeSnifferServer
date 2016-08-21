package com.tradesniffer.service;

import com.tradesniffer.entity.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Component
public class UserService {

    @GET
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public User setUserLocation(){
        return new User();
    }

}