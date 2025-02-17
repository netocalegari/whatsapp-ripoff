package com.neto.whatsapp_ripoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatsappRipoffApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappRipoffApiApplication.class, args);
	}

}
