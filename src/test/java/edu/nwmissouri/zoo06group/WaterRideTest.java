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
 * @author S545019
 */
public class WaterRideTest {
    
    public WaterRideTest() {
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
     * Test of getPlayers method, of class WaterRide.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        WaterRide instance = new WaterRide();
        int expResult = 0;
        int result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class WaterRide.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        int players = 0;
        WaterRide instance = new WaterRide();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceOfTicket method, of class WaterRide.
     */
    @Test
    public void testGetPriceOfTicket() {
        System.out.println("getPriceOfTicket");
        WaterRide instance = new WaterRide();
        double expResult = 0.0;
        double result = instance.getPriceOfTicket();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceOfTicket method, of class WaterRide.
     */
    @Test
    public void testSetPriceOfTicket() {
        System.out.println("setPriceOfTicket");
        double priceOfTicket = 0.0;
        WaterRide instance = new WaterRide();
        instance.setPriceOfTicket(priceOfTicket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketType method, of class WaterRide.
     */
    @Test
    public void testGetTicketType() {
        System.out.println("getTicketType");
        WaterRide instance = new WaterRide();
        String expResult = "";
        String result = instance.getTicketType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketType method, of class WaterRide.
     */
    @Test
    public void testSetTicketType() {
        System.out.println("setTicketType");
        String ticketType = "";
        WaterRide instance = new WaterRide();
        instance.setTicketType(ticketType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resultOfGame method, of class WaterRide.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("resultOfGame");
        WaterRide instance = new WaterRide();
        String expResult = "";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class WaterRide.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("onlineBooking");
        WaterRide instance = new WaterRide();
        String expResult = "";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class WaterRide.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        WaterRide instance = new WaterRide();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
