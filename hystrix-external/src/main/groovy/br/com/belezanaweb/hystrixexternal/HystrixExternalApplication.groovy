package br.com.belezanaweb.hystrixexternal

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAutoConfiguration
class HystrixExternalApplication {

	static void main(String[] args) {
		SpringApplication.run HystrixExternalApplication, args
	}
}
