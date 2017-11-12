package br.com.belezanaweb.hystrixexamples

class Logger {

    static void log(Object msg) {
        println(Thread.currentThread().getName() + ": " + msg)
    }
}
