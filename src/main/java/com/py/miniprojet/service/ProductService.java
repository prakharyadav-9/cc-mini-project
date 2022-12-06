package com.py.miniprojet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.py.miniprojet.entity.Blog;
import com.py.miniprojet.entity.Product;
import com.py.miniprojet.repository.BlogRepository;
import com.py.miniprojet.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    
    @Autowired
    private BlogRepository blogRepository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public Blog saveBlog(Blog blog) {
		return blogRepository.save(blog);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
