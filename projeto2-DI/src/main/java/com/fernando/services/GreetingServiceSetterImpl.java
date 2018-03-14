/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.services;

import org.springframework.stereotype.Service;

@Service  //define que é um bean
public class GreetingServiceSetterImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		return "GreetingServiceSetterImpl da setter...";
	}

}
