package co.com.spring.cxf.data;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod(action = "sayHi")
	@WebResult(name = "message")
	String sayHi(@WebParam final String name);
}
