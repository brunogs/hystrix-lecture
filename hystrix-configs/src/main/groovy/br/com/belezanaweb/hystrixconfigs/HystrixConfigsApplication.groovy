package br.com.belezanaweb.hystrixconfigs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class HystrixConfigsApplication {

	static void main(String[] args) {
		SpringApplication.run HystrixConfigsApplication, args
	}
}
