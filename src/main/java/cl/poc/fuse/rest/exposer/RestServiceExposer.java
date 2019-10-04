package cl.poc.fuse.rest.exposer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/FuseRest")
public class RestServiceExposer {

	@GET
	@Path("/Cliente/{name}/")
	public String getCustomer(@PathParam("name") String name) {
		return "Welcome " + name;
	}

}