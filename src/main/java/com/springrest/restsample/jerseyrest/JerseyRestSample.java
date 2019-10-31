package com.springrest.restsample.jerseyrest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/jersey-api")
public class JerseyRestSample {

    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
    @POST
    public String getString(String str){

         return "jersey success";
    }
}
