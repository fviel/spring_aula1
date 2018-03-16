/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.controllers;

import com.fernando.services.GreetingService;
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
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    public SetterInjectedControllerTest() {
    }

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService( new GreetingServiceImpl());
    }

    /**
     * Test of sayHello method, of class SetterInjectedController.
     */
    @Test
    public void testSayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }

}
