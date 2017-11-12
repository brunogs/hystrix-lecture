package br.com.belezanaweb.hystrixexamples.fallbacks

import br.com.belezanaweb.hystrixexamples.Logger
import br.com.belezanaweb.hystrixexamples.client.ExternalMessageClient
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@RefreshScope
@Component
class ExternalConfigFallback {

    @Value('${app.messages.default}')
    String messageDefault

    @Autowired
    ExternalMessageClient externalMessageClient

    @HystrixCommand(commandKey = 'showMessage', fallbackMethod = 'showDefaultMessage')
    def showExternalMessage() {
        Logger.log(externalMessageClient.messages.head())
    }

    def showDefaultMessage() {
        Logger.log(messageDefault)
    }

}
