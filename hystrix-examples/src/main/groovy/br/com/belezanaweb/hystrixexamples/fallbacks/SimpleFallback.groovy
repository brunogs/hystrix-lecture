package br.com.belezanaweb.hystrixexamples.fallbacks

import br.com.belezanaweb.hystrixexamples.Logger
import br.com.belezanaweb.hystrixexamples.client.ExternalMessageClient
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SimpleFallback {

    @Value('${app.message.default}')
    String messageDefault

    @Autowired
    ExternalMessageClient externalMessageClient

    @HystrixCommand(fallbackMethod = 'showDefaultMessage')
    def showExternalMessage() {
        Logger.log(externalMessageClient.messages.head())
    }

    def showDefaultMessage() {
        Logger.log(messageDefault)
    }
}
