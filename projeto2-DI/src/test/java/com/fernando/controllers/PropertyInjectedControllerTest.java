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
public class PropertyInjectedControllerTest {
    
    private PropertyInjectedController propertyInjectedController;
    
    public PropertyInjectedControllerTest() {
    }
    
    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
        
    }
    
   
    /**
     * Test of sayHello method, of class PropertyInjectedController.
     */
    @Test
    public void testSayHello() {
        /*System.out.println("sayHello");
        PropertyInjectedController instance = new PropertyInjectedController();
        String expResult = "";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
    
}
