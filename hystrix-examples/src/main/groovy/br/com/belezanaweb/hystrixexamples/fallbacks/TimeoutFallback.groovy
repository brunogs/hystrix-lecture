package br.com.belezanaweb.hystrixexamples.fallbacks

import br.com.belezanaweb.hystrixexamples.Logger
import br.com.belezanaweb.hystrixexamples.client.ExternalMessageClient
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class TimeoutFallback {

    @Value('${app.message.default}')
    String messageDefault

    @Autowired
    ExternalMessageClient externalMessageClient

    @HystrixCommand(fallbackMethod = 'showDefaultMessage', commandProperties = [
            @HystrixProperty(name = 'execution.isolation.thread.timeoutInMilliseconds', value = '100')
    ])
    def showExternalMessage() {
        Logger.log(externalMessageClient.messages)
    }

    def showDefaultMessage() {
        Logger.log(messageDefault)
    }

}
