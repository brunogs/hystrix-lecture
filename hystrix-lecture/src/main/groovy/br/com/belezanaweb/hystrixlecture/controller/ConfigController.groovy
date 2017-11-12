package br.com.belezanaweb.hystrixlecture.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController {

    @Value('${app.messages.default}')
    String message

    @GetMapping('/message')
    String getMessage() {
        message
    }

}
