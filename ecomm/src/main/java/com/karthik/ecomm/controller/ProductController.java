package com.karthik.ecomm.controller;

import com.karthik.ecomm.entity.Product;
import com.karthik.ecomm.exceptions.ProductNotFoundException;
import com.karthik.ecomm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product/v1")
public class ProductController {
    @Autowired
    ProductService productService;

        @GetMapping("/getProductById/{productId}")
        public ResponseEntity<?> getProductById(@PathVariable Integer productId) {
                 Product product = productService.findById(productId)
                         .orElseThrow(() ->
                                 new ProductNotFoundException("Product not found with id : " + productId));
                 return ResponseEntity.ok(product);
        }

    @GetMapping("/getProductByName/{productName}")
    public String getProductByName(@PathVariable String productName)
    {
        Product product=productService.findByName(productName)
                .orElseThrow(()->new ProductNotFoundException("Product not found with name : "+productName));
        return "product";
    }

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        System.out.println("add product controller");
        Product createdProduct=productService.addProduct(product);

        return ResponseEntity.ok(createdProduct);
    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException e) {
//            ErrorResponse productNotFound=new ErrorResponse(LocalDateTime.now(),e.getMessage(),"Product really " +
//                    "not found");
//            return new ResponseEntity<>(productNotFound,HttpStatus.NOT_FOUND);
//    }

}
