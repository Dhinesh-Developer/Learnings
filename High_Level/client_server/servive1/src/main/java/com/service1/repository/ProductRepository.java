package com.service1.repository;

import org.springframework.stereotype.Repository;

import com.service1.dto.ProductRequest;
import com.service1.entity.ProductEntity;

@Repository
public class ProductRepository {
    

    public ProductEntity getProductById(ProductRequest productRequest){
        ProductEntity product  = executeQuery(productRequest);
        return product;
    }

    public ProductEntity executeQuery(ProductRequest productRequest){
        ProductEntity productModel = new ProductEntity();
        productModel.setId(productRequest.getId());
        productModel.setName("IPhone");
        productModel.setDescription("Apple 18 pro max!!!");
        return productModel;
    }

}
