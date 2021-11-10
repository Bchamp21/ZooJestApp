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
public class JungleCruzeTest {
    
    public JungleCruzeTest() {
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
     * Test of getHeight method, of class JungleCruze.
     */
   @Test
    public void testGetHeight() {
       System.out.println("getHeight");
        JungleCruze instance = new JungleCruze();
       int expResult = 0;
       int result = instance.getHeight();
       assertEquals(expResult, result);
       // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class JungleCruze.
     */
    @Test
   public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        JungleCruze instance = new JungleCruze();
      instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
   }

    /**
     * Test of resultOfGame method, of class JungleCruze.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("resultOfGame");
        JungleCruze instance = new JungleCruze();
        String expResult = "You never Loose";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class JungleCruze.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("onlineBooking");
        JungleCruze instance = new JungleCruze();
        String expResult = "Your ticket is booked";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class JungleCruze.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        int expResult = 0;
        int result = JungleCruze.speed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
