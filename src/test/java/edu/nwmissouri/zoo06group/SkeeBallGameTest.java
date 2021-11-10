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
public class SkeeBallGameTest {
    
    public SkeeBallGameTest() {
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
     * Test of resultOfGame method, of class SkeeBallGame.
     */
    @Test
    public void testResultOfGame() {
        System.out.println("resultOfGame");
        SkeeBallGame instance = new SkeeBallGame();
        String expResult = "You never Loose";
        String result = instance.resultOfGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of onlineBooking method, of class SkeeBallGame.
     */
    @Test
    public void testOnlineBooking() {
        System.out.println("onlineBooking");
        SkeeBallGame instance = new SkeeBallGame();
        String expResult = "Your ticket is booked";
        String result = instance.onlineBooking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfBalls method, of class SkeeBallGame.
     */
    @Test
    public void testGetNumberOfBalls() {
        System.out.println("getNumberOfBalls");
        SkeeBallGame instance = new SkeeBallGame();
        int expResult = 0;
        int result = instance.getNumberOfBalls();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfBalls method, of class SkeeBallGame.
     */
    @Test
    public void testSetNumberOfBalls() {
        System.out.println("setNumberOfBalls");
        int numberOfBalls = 0;
        SkeeBallGame instance = new SkeeBallGame();
        instance.setNumberOfBalls(numberOfBalls);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of goal method, of class SkeeBallGame.
     */
    @Test
    public void testGoal() {
        System.out.println("goal");
        String expResult = "";
        String result = SkeeBallGame.goal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
