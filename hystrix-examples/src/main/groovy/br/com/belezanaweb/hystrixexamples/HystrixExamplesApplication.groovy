package br.com.belezanaweb.hystrixexamples

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.scheduling.annotation.EnableScheduling

@EnableHystrix
@EnableFeignClients
@EnableScheduling
@SpringBootApplication
class HystrixExamplesApplication {

	static void main(String[] args) {
		SpringApplication.run HystrixExamplesApplication, args
	}

}
