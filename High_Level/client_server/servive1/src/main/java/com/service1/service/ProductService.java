package com.service1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.dto.ProductRequest;
import com.service1.dto.ProductResponse;
import com.service1.entity.ProductEntity;
import com.service1.repository.ProductRepository;

@Service
public class ProductService {
    

    @Autowired
    private ProductRepository productRepository;


    public ProductResponse getProductById(ProductRequest productRequest){
        ProductEntity productModel = productRepository.getProductById(productRequest);

        ProductResponse response = mapToProductResponse(productModel);
        return response;
    }

    public ProductResponse mapToProductResponse(ProductEntity productModel){
        ProductResponse response = new ProductResponse();
        response.setId(productModel.getId());
        response.setName(productModel.getName());
        response.setDescription(productModel.getDescription());
        return response;
    }


}
