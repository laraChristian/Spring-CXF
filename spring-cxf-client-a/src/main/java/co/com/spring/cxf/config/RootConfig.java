package co.com.spring.cxf.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import co.com.spring.cxf.data.HelloWorld;

@Configuration
@EnableWebMvc
@ComponentScan({ "co.com.spring.cxf.apis", "co.com.spring.cxf.data" })
public class RootConfig {

	@Bean
	public HelloWorld getHelloWorldSoapClient() {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:8080/spring-cxf-b/services/HelloWorld");
		return (HelloWorld) factoryBean.create();
	}

}
