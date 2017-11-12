package br.com.belezanaweb.hystrixexternal.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping('external-messages')
    List<String> getMessages() {
        Thread.sleep(500)
        ['Mais com menos']
    }
}
