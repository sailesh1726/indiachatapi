package com.sparks.indiachatapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/indiaChat")
public class StoreMessages {

	@Path("/storeMessages")
	@GET
	@Produces("application/json")
	public String storeMessages(){
		
		return "This is Sailesh";
	}
}
