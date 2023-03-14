package ru.ruszhu.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ruszhu.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
