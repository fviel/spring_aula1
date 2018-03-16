/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.fernando.services.GreetingService;

/**
 * Injeção de dependência por construtor
 * Observe que não usei um @Autowired, pois o container identifica que deverá
 * fazer o @Autowired em parâmetros do contrutor.
 *
 * @author Fernando
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    /*Neste método é feito o set da dependencia, ou seja na construtora
    é passado o objeto da dependência.
    observe que não foi feito um new, pois o container identifica que é
    um ponto de injeção.
    E também não preciso fazer um @Autowired na contrutora, pois por automático o
    container fará autowired de parâmetros da contrutora. Contudo, se eu quiser
    colocar um @Autowired aqui, não há problemas.
	 A anotação @Qualifier aponta qual impl injetar
    */
    public ConstructorInjectedController(@Qualifier("greetingServiceConstructorImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
