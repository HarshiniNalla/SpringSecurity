
package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.entity.Product;
import com.example.exception.ProductNotFoundException;


public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> fetchAllProducts();
    public Product fetchProduct(Long id) throws ProductNotFoundException;

}
