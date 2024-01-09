package com.securityDemo.service;

import com.securityDemo.dto.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {

    List<Product> productList =null;
    @PostConstruct
    public void loadProductFromDB(){
        productList= IntStream.range(1,100)
                .mapToObj(i-> Product.builder()
                        .Id(i)
                        .name("product"+i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build()
                ).collect(Collectors.toList());
    }

    public List<Product> getProducts(){
        return productList;
    }

    public Product getProduct(int id){
       return productList.stream().filter( p -> p.getId()==id)
                .findAny()
                .orElseThrow(()->new RuntimeException("Product "+id+" not found"));
    }
}
