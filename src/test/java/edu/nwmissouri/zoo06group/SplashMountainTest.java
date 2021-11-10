/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo06group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Himaja Reddy Maddi
 */
public class SplashMountainTest {
    
    public SplashMountainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumberOfSeats method, of class SplashMountain.
     */
    @Test
    public void testGetNumberOfSeats() {
        System.out.println("getNumberOfSeats");
        SplashMountain instance = new SplashMountain();
        int expResult = 0;
        int result = instance.getNumberOfSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeats method, of class SplashMountain.
     */
    @Test
    public void testSetNumberOfSeats() {
        System.out.println("setNumberOfSeats");
        int numberOfSeats = 0;
        SplashMountain instance = new SplashMountain();
        instance.setNumberOfSeats(numberOfSeats);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resultOfGame method, of class SplashMountain.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("resultOfGame");
        SplashMountain instance = new SplashMountain();
        String expResult = "You never Loose";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class SplashMountain.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("onlineBooking");
        SplashMountain instance = new SplashMountain();
        String expResult = "Your ticket is booked";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class SplashMountain.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        String expResult = "";
        String result = SplashMountain.speed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
