package br.edu.ifrn.biblioteca.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {

        MessageDispatcherServlet servlet = new MessageDispatcherServlet();

        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean
    public XsdSchema bibliotecaSchema() {
        return new SimpleXsdSchema(
            new ClassPathResource("xsd/biblioteca.xsd")
        );
    }

    @Bean(name = "biblioteca")
    public DefaultWsdl11Definition bibliotecaWsdl(
            XsdSchema bibliotecaSchema) {

        DefaultWsdl11Definition wsdl =
            new DefaultWsdl11Definition();

        wsdl.setPortTypeName("BibliotecaPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("http://biblioteca.ifrn.edu.br");
        wsdl.setSchema(bibliotecaSchema);

        return wsdl;
    }
}
