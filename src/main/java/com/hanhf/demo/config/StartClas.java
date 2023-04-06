package com.hanhf.demo.config;

import com.hanhf.demo.service.UserService;
import com.hanhf.demo.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import javax.xml.ws.Endpoint;

@Configuration
public class StartClas {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean(name = "wsBean")
    public ServletRegistrationBean dispatcherServlet() {
        ServletRegistrationBean wbsServlet = new ServletRegistrationBean((Servlet) new CXFServlet(), "/ws/*");
        return wbsServlet;
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public Endpoint endpointPurchase(SpringBus springBus, UserService userService) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        endpoint.publish("/api");
        System.out.println("服务发布成功！地址为：http://localhost:8081/ws/api?wsdl");
        return endpoint;


    }
}



