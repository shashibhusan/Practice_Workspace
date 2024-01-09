package com.securityDemo.Controller;

import com.securityDemo.dto.Product;
import com.securityDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productService;
    @GetMapping("/welcome")
    public String welcome(){
        return "This end point is not secure";
    }

    @GetMapping("/all")
    public List<Product> getAllProduct(){
    return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProduct(id);
    }
}
