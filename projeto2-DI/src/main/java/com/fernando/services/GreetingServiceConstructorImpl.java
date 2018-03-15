/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//define como um spring bean de service
@Service
public class GreetingServiceConstructorImpl implements GreetingService {

    public static final String HELLO_GURUS = "Olá Fernando, este é o retorno de mais um impl de GreetingService para forçar o uso de @Qualifier";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
