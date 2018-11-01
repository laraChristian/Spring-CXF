package co.com.spring.cxf.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {

	@Autowired
	private HelloWorld helloWorld;

	public String sayHi(final String name) {
		return helloWorld.sayHi(name);
	}
}
