package co.com.spring.cxf.data;

import javax.jws.WebService;

@WebService(endpointInterface = "co.com.spring.cxf.data.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String name) {
		String message = "Hello " + name;
		return message;
	}

}
