package co.com.spring.cxf.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.spring.cxf.data.HelloWorldRepository;

@RestController
@RequestMapping(value = "/hello-api")
public class HelloApi {

	@Autowired
	private HelloWorldRepository repository;

	@PostMapping(value = "/say-hello")
	public ResponseEntity<String> sayHello(@RequestBody final String name) {
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(repository.sayHi(name), HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

	@GetMapping(value = "/{name}")
	public String get(@PathVariable final String name) {
		String resp = repository.sayHi(name);
		return resp;
	}
}
