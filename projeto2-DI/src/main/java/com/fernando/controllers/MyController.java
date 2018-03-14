/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import org.springframework.stereotype.Controller;

import com.fernando.services.GreetingService;

/**
 * @Controller torna  classe passa a ser uma entidade gerenciada pelo spring (BEAN) e entra no spring context
 * @author Fernando
 */
//
@Controller
public class MyController {

	 private GreetingService greetingService;

	 //considerando que não passei um @Qualifier, irá buscar o bean com @Primary
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String hello(){
        System.out.println("Olá Fernando!");
        return greetingService.sayGreeting();
    }

}
