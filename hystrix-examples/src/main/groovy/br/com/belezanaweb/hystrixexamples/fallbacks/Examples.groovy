package br.com.belezanaweb.hystrixexamples.fallbacks

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Examples {

    @Autowired
    SimpleFallback simpleFallback

    @Scheduled(fixedDelay = 3000L)
    void run() {
        simpleFallback.showExternalMessage()
    }
}
