package com.springrest.restsample.config;

import com.springrest.restsample.jerseyrest.JerseyRestSample;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(JerseyRestSample.class);
    }
}
