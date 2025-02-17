package com.neto.whatsapp_ripoff;

import com.neto.whatsapp_ripoff.config.UploadConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(UploadConfig.class)
public class WhatsappRipoffApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappRipoffApiApplication.class, args);
	}

}
