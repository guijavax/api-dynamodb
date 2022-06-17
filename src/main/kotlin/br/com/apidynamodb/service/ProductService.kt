package br.com.apidynamodb.service

import br.com.apidynamodb.models.ProductModel
import br.com.apidynamodb.repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ProductService(val repository: ProductRepository) {

    fun createProduct(model : ProductModel) {
        repository.save(model)
    }

    fun findProducts() : List<ProductModel> {
        return repository.findAll() as List<ProductModel>
    }
}