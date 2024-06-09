package kafka.enduser.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class EndUserConfig {

	
	@KafkaListener
	public void updatedLocation(String value) {
		
		
	}
	
}
