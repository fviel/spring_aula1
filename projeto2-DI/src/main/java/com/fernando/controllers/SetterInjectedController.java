/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.fernando.services.GreetingService;

/**
 * Este é um exemplo de DI por setter
 * @author Fernando
 */
@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //neste método é feito o set da dependencia
    @Autowired // avisa para injetar no método
	 @Qualifier("greetingServiceSetterImpl") //como eu tenho mais de um impl para GreetingService, uso o @Qualifier para informar qual o bean (impl) injetado
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
