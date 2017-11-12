package br.com.belezanaweb.hystrixexamples.fallbacks

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Examples {

    @Autowired
    SimpleFallback simpleFallback

    @Autowired
    TimeoutFallback timeoutFallback

    @Autowired
    ExternalConfigFallback externalConfigFallback

    @Scheduled(fixedDelay = 2000L)
    void run() {
        externalConfigFallback.showExternalMessage()
    }
}
