package com.foriba.thorntail.demo_mp_thorntail_01;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

	private String message = "Hello World";
	
    @GET
    public String sayHello() {
        return message;
    }
    
    @POST
    @Path("/{message}")
    public String setMessage(@PathParam("message")String msg) {
		
    	message = msg;
    	return "Success";
    	
    	
    }
    
}
