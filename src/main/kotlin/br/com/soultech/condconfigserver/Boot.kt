package br.com.soultech.condconfigserver

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableConfigServer
class Boot

fun main(args: Array<String>) {
    runApplication<Boot>(*args)
}