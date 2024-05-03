package cat.institutmarianao.helloworld.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorldService {
	@GET
	@Produces("text/html")
	public String sayHello() {
		return "Hello World WS!!!";
	}
}