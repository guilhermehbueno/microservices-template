package microservices.template.routes;

import microservices.template.processors.HelloWorldProcessor;

import org.apache.camel.builder.RouteBuilder;

public class MicroServicesRouteBuilder extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("jetty://http://localhost:8182/thrift").process(new HelloWorldProcessor()).end();
	}
}
