/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service //determina que o spring context deverá carregar como um bean
@Primary //determina que entre as várias implementações do service, esta é a principal
@Profile("en_us")
public class PrimaryGreetingService implements GreetingService{

     public static final String MSG = "Mesg do primary bean";

     
    @Override
    public String sayGreeting() {
        return MSG;
    }
    
}
