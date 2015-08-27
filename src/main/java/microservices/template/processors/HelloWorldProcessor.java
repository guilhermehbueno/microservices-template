package microservices.template.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorldProcessor implements Processor, InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	@Override
	public void process(Exchange exc) throws Exception {
		System.out.println("Hello Jetty!");
		System.out.println(exc.getIn().getBody());
	}
}
