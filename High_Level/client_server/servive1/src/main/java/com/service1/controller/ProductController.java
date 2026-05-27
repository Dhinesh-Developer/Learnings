package com.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.dto.ProductRequest;
import com.service1.dto.ProductResponse;
import com.service1.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        // map to request
        ProductRequest request = new ProductRequest();
        request.setId(id);

        // get data from service
        ProductResponse response = productService.getProductById(request);
        return ResponseEntity.ok(response);

    }
}
