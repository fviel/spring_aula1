/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import com.fernando.services.GreetingServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class ContructorInjectedControllerTest {
    
     private ConstructorInjectedController constructorInjectedController;
     
    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }       

    /**
     * Test of sayHello method, of class ContructorInjectedController.
     */
    @Test
    public void testSayHello() {
       assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
    
}
