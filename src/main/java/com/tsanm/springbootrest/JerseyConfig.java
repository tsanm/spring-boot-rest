package com.tsanm.springbootrest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.tsanm.springbootrest.rest.PingRestResource;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(PingRestResource.class);
	}

}