package br.com.apidynamodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiDynamodbApplication

fun main(args: Array<String>) {
	runApplication<ApiDynamodbApplication>(*args)
}
