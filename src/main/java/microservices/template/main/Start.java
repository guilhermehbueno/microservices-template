package microservices.template.main;

import microservices.template.routes.MicroServicesRouteBuilder;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class Start {
	
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new MicroServicesRouteBuilder());
		context.start();
	}
}
