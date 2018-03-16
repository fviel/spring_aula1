/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.fernando.services.GreetingServiceImpl;

/**
 * Esta classe exemplifica a injeção de dependência por atributo ou propriedade, utilizando uma interface para manter o desacoplamento
 *
 * @author Fernando
 */
@Controller
public class PropertyInjectedController {
    //Esse é um exemplo de DI por 'property', GreetingServiceImpl é uma propriedade/atributo público injetada;
    @Autowired //Avisa ao container que é um ponto de injeção de dependência
	 @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
