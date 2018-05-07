package com.tsanm.springbootrest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/ping")
public class PingRestResource {

	@GET
	public Response ping() {
		return Response.ok("pong").build();
	}
}
