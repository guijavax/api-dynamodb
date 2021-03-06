package br.com.apidynamodb.models

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

/**
 * @author: Guilherme
 */
@DynamoDBTable(tableName = "Product")
data class ProductModel(

    /**
     * @param: id
     * Campo referente a partition key
     */
    @DynamoDBHashKey
    var id : Int = 0,

    @DynamoDBAttribute
    var msrp: String = "",

    @DynamoDBAttribute
    var cost : String = ""
) {

}