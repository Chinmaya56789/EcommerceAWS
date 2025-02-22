package com.chintu.ecommerce.controller;


import com.chintu.ecommerce.DTOs.APIResposne;
import com.chintu.ecommerce.Models.Product;
import com.chintu.ecommerce.Services.ProductRetreive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.management.MemoryType;

@RestController
@RequestMapping("/getProduct")
public class PrimaryController {

    @Autowired
    private ProductRetreive pr;

    @GetMapping("/{id}")
    public APIResposne retreiveSpecificProduct(@PathVariable int id){
        return  pr.getOneProduct(id);
    }

    @GetMapping("/all")
    public String retreiveproducts(){
        return pr.getProductsList().toString();
    }

    @GetMapping("/add/{name}")
    public APIResposne addProduct(@PathVariable String name){

        int randomid= (int) (Math.random() * 100);
        System.out.println("Product Name : " +name + "ID " + randomid );
        return pr.addtoList( new Product(randomid,name,"Random"));
    }



}
