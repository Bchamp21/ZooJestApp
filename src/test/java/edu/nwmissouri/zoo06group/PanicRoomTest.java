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
 * @author Indu Chinthakuntla
 */
public class PanicRoomTest {
    
    public PanicRoomTest() {
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
     * Test of resultOfGame method, of class PanicRoom.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("resultOfGame");
        PanicRoom instance = new PanicRoom();
        String expResult = "You never Loose";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class PanicRoom.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("onlineBooking");
        PanicRoom instance = new PanicRoom();
        String expResult = "Your ticket is booked";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of darkRoom method, of class PanicRoom.
     */
    @Test
    public void testDarkRoom() {
        System.out.println("darkRoom");
        boolean expResult = true;
        boolean result = PanicRoom.darkRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfRooms method, of class PanicRoom.
     */
    @Test
    public void testGetNumberOfRooms() {
        System.out.println("getNumberOfRooms");
        PanicRoom instance = new PanicRoom();
        int expResult = 0;
        int result = instance.getNumberOfRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfRooms method, of class PanicRoom.
     */
    @Test
    public void testSetNumberOfRooms() {
        System.out.println("setNumberOfRooms");
        int numberOfRooms = 0;
        PanicRoom instance = new PanicRoom();
        instance.setNumberOfRooms(numberOfRooms);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
