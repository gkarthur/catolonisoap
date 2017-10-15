package com.archi.repo.cap.catoloni.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.feature.LoggingFeature;
import com.archi.repo.cap.catoloni.service.CatoloniWS;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;


@Configuration
public class CatoloniWSConfig {

	@Autowired
    private Bus bus;
 	
    @Bean
    public Endpoint endpoint() {
   	
    	EndpointImpl endpoint = new EndpointImpl(bus, new CatoloniWS());        
        endpoint.publish("/CatoloniService");
        
        // Ajout de la feature "logging"        
        endpoint.getFeatures().add(loggingFeature());
        
        return endpoint;
    }
    
    
    /**
	 * Ajout de la feature "logging" (en remplacement des loggingInInterceptors et...)
	 * pour tracer les requetes in out
	 * Il est possible de definir cette feature au niveau Bus (generale) 
	 * @return
	 */
	@Bean
    public LoggingFeature loggingFeature() {
		LoggingFeature logFeature = new LoggingFeature();
        logFeature.setPrettyLogging(true);
        logFeature.initialize(bus);
        return logFeature;
	}
	
}
