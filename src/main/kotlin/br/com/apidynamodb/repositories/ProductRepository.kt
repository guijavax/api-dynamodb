package br.com.apidynamodb.repositories

import br.com.apidynamodb.models.ProductModel
import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
interface ProductRepository : CrudRepository<ProductModel, Int>