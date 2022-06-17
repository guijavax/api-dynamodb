package br.com.apidynamodb

import br.com.apidynamodb.models.ProductModel
import br.com.apidynamodb.service.ProductService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource

/**
 * @author: Guilherme Alves
 */
@SpringBootTest
class ApiDynamodbApplicationTests {


	@Autowired
	lateinit var service: ProductService

	@Test
	fun createProduct() {
		val product = ProductModel(2, "Maquin", "total")
		service.createProduct(product)
	}

	@Test
	fun findProduct() {
		val products = service.findProducts()
		println(products)
	}

}
