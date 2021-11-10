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
public class RollerCoasterTest {
    
    public RollerCoasterTest() {
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
     * Test of getWheels method, of class RollerCoaster.
     */
    @Test
    public void testGetWheels() {
        System.out.println("wheels");
        RollerCoaster instance = new RollerCoaster();
        int expResult = 0;
        int result = instance.getWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWheels method, of class RollerCoaster.
     */
    @Test
    public void testSetWheels() {
        System.out.println("wheels");
        int wheels = 0;
        RollerCoaster instance = new RollerCoaster();
        instance.setWheels(wheels);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class RollerCoaster.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("players");
        RollerCoaster instance = new RollerCoaster();
        int expResult = 0;
        int result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class RollerCoaster.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("players");
        int players = 0;
        RollerCoaster instance = new RollerCoaster();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketType method, of class RollerCoaster.
     */
    @Test
    public void testGetTicketType() {
        System.out.println("ticketType");
        RollerCoaster instance = new RollerCoaster();
        String expResult = null;
        String result = instance.getTicketType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketType method, of class RollerCoaster.
     */
    @Test
    public void testSetTicketType() {
        System.out.println("ticketType");
        String ticketType = "ticketType";
        RollerCoaster instance = new RollerCoaster();
        instance.setTicketType(ticketType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resultOfGame method, of class RollerCoaster.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("You won the game");
        RollerCoaster instance = new RollerCoaster();
        String expResult = "You never Loose";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class RollerCoaster.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("Welcome to adventure rides");
        RollerCoaster instance = new RollerCoaster();
        String expResult = "Your ticket is booked";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rotations method, of class RollerCoaster.
     */
    @Test
    public void testRotations() {
        System.out.println("You successfully stayed alive");
        int expResult = 0;
        int result = RollerCoaster.rotations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
