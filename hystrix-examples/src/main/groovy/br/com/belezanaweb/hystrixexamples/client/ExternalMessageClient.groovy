package br.com.belezanaweb.hystrixexamples.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

import static org.springframework.web.bind.annotation.RequestMethod.GET

@FeignClient(url = 'http://localhost:9080/external-messages', name = 'external-messages')
interface ExternalMessageClient {

    @RequestMapping(method = GET)
    List<String> getMessages()

}
