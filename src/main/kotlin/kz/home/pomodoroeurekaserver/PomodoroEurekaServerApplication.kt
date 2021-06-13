package kz.home.pomodoroeurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class PomodoroEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<PomodoroEurekaServerApplication>(*args)
}
