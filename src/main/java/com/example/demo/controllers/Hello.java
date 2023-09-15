package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HelloService;

@RestController
@RequestMapping("/servidor")
public class Hello {

    @Autowired
    public HelloService helloService;

    @GetMapping("/hello")
    public String getHelloWorld(){
        String ret = "Hello World Get: " + helloService.quantidadeGets();
        return ret;
    }
    
    @PostMapping("/hello")
    public String getHelloWorld2(){
        String ret = "Hello World Post: " + helloService.quantidadePosts();
        return ret;
    }

    @PutMapping("/hello")
    public String getHelloWorld3(){
        String ret = "Hello World Put: " + helloService.quantidadePuts();
        return ret;
    }

    @DeleteMapping("/hello")
    public String getHelloWorld4(){
        String ret = "Hello World : " + helloService.quantidadeDeletes();
        return ret;
    }

}
