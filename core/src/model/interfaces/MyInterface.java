package model.interfaces;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Local
public interface MyInterface {
	@GET
	@Path("/eSearch")
	String sayHello();
}
