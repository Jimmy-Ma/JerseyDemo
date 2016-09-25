package com.jimmy.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
	
	private static final String CHARSET_UTF_8 = "charset=utf-8";
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World!";
	}

	@GET
	@Path("{username}")
	@Produces(MediaType.TEXT_PLAIN + ";" + CHARSET_UTF_8)
	public String sayHelloToUTF8(@PathParam("username") String username) {
		return "Hello " + username;
	}
	
}
