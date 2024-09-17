package com.baidikik.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static ch.qos.logback.core.joran.spi.ConsoleTarget.findByName;

@Service
public class ProductService {
    public void show(){
        System.out.println("in show ");
    }

    @Autowired
    ProductDB db;


    public void addProduct(Product p){
        //products.add(p);

        db.save(p);
    }

    public List<Product> getAllProducts(){
        return db.findAll();
    }

    public Product getProduct(String name){
        return db.findByName(name);
    }

}
