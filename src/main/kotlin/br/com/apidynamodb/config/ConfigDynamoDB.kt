package br.com.apidynamodb.config

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


/**
 * @author: Guilherme Alves
 * Classe de configuração do dynamodb
 */
@Configuration
@EnableDynamoDBRepositories(basePackages = ["br.com.apidynamodb.repositories"])
class ConfigDynamoDB {

    @Value("\${amazon.dynamodb.endpoint}")
    lateinit var endpointConfig : String

    @Value("\${amazon.region}")
    lateinit var region : String


    @Bean
    fun amazonDynamoDB() : AmazonDynamoDB {
        return  AmazonDynamoDBClientBuilder.standard().apply {
            withCredentials(setCredentials())
        }.build()
    }

    @Bean
    fun setCredentials() =  EnvironmentVariableCredentialsProvider()

}