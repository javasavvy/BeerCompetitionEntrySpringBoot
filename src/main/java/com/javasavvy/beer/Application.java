package com.javasavvy.beer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


/**
 * A default behavior of Spring Boot when using the @SpringBootApplication annotation is to perform
 * a package scan on its package (and all sub packages) so we need to specify the com package in order
 * to ensure that our spring annotations ill be found in the scan from parent packages.
 */
/* The @SpringBootApplication adds the following annotations below so they are not needed */
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@EnableWebMvc
//@ComponentScan(basePackages = "com")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        // TODO add a logger
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    /**
     * The first step in producing a deployable war file is to provide a
     * SpringBootServletInitializer subclass and override its configure method.
     * This makes use of Spring Framework's Servlet 3.0 support and allows you
     * to configure your application when it's launched by the servlet container.
     * Typically, you update your application's main class to extend
     * SpringBootServletInitializer:
     *
     *
     * @param application SpringWebApplicationBuilder
     * @return Configurable SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // application.sources allows us to add more configuration lasses or components to
        // appliationBuilder, then we retrn the current application.
        //TODO learn how to use this method!
        return application.sources(Application.class);
    }

}