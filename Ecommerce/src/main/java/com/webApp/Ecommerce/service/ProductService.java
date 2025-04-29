package com.webApp.Ecommerce.service;

import com.webApp.Ecommerce.entity.Product;
import com.webApp.Ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getProductByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public Product addProduct(Product product) {
        Optional<Product> existingProduct = productRepo.findById(product.getId());
        if(existingProduct.isPresent()) throw new RuntimeException("Product already exist with id"+product.getId());
        return productRepo.save(product);
    }
}
