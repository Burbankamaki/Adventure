/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import byui260.adventure.entities.Endgame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Burbank
 */
public class EndgameTest {
    
    public EndgameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayCarFreewayHospital method, of class Endgame.
     */
    @Test
    public void testDisplayCarFreewayHospital() {
        System.out.println("displayCarFreewayHospital");
        Endgame instance = new Endgame();
        instance.displayCarFreewayHospital();

    }

    /**
     * Test of displayCarFreewayWork method, of class Endgame.
     */
    @Test
    public void testDisplayCarFreewayWork() {
        System.out.println("displayCarFreewayWork");
        Endgame instance = new Endgame();
        instance.displayCarFreewayWork();

    }

    /**
     * Test of displayCarAnimalHospital method, of class Endgame.
     */
    @Test
    public void testDisplayCarAnimalHospital() {
        System.out.println("displayCarAnimalHospital");
        Endgame instance = new Endgame();
        instance.displayCarAnimalHospital();

    }

    /**
     * Test of displayCarAnimalWork method, of class Endgame.
     */
    @Test
    public void testDisplayCarAnimalWork() {
        System.out.println("displayCarAnimalWork");
        Endgame instance = new Endgame();
        instance.displayCarAnimalWork();

    }

    /**
     * Test of displayWalkAnimalWork method, of class Endgame.
     */
    @Test
    public void testDisplayWalkAnimalWork() {
        System.out.println("displayWalkAnimalWork");
        Endgame instance = new Endgame();
        instance.displayWalkAnimalWork();

    }

    /**
     * Test of displayWalkAnimalHostial method, of class Endgame.
     */
    @Test
    public void testDisplayWalkAnimalHostial() {
        System.out.println("displayWalkAnimalHostial");
        Endgame instance = new Endgame();
        instance.displayWalkAnimalHostial();

    }

    /**
     * Test of displayWalkHitchHikerWork method, of class Endgame.
     */
    @Test
    public void testDisplayWalkHitchHikerWork() {
        System.out.println("displayWalkHitchHikerWork");
        Endgame instance = new Endgame();
        instance.displayWalkHitchHikerWork();

    }

    /**
     * Test of displayWalkHitchHikerHospital method, of class Endgame.
     */
    @Test
    public void testDisplayWalkHitchHikerHospital() {
        System.out.println("displayWalkHitchHikerHospital");
        Endgame instance = new Endgame();
        instance.displayWalkHitchHikerHospital();

    }

    /**
     * Test of displayWalkHospitalWork method, of class Endgame.
     */
    @Test
    public void testDisplayWalkHospitalWork() {
        System.out.println("displayWalkHospitalWork");
        Endgame instance = new Endgame();
        instance.displayWalkHospitalWork();

    }

    /**
     * Test of displayWalkHospitalHospital method, of class Endgame.
     */
    @Test
    public void testDisplayWalkHospitalHospital() {
        System.out.println("displayWalkHospitalHospital");
        Endgame instance = new Endgame();
        instance.displayWalkHospitalHospital();

    }

    /**
     * Test of displayWinLossInfo method, of class Endgame.
     */
    @Test
    public void testDisplayWinLossInfo() {
        
        //test 1
        System.out.println("displayWinLossInfo - test 1");
        int totalWins = 0;
        int totalLosses = 0;
        boolean indicator = true;
        Endgame instance = new Endgame();
        double expResult = 100.0;
        double result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
    
        //test 2
        System.out.println("displayWinLossInfo - test 2");
        totalWins = 0;
        totalLosses = 0;
        indicator = false;
        expResult = 0.0;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
      
        //test 3
        System.out.println("displayWinLossInfo - test 3");
        totalWins = 0;
        totalLosses = 1;
        indicator = true;
        expResult = 50.0;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
         
        //test 4
        System.out.println("displayWinLossInfo - test 4");
        totalWins = 1;
        totalLosses = 0;
        indicator = false;
        expResult = 50.0;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
        
        //test 5
        System.out.println("displayWinLossInfo - test 5");
        totalWins = 2;
        totalLosses = 2;
        indicator = true;
        expResult = 60.0;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
        
        //test 6
        System.out.println("displayWinLossInfo - test 6");
        totalWins = -1;
        totalLosses = 0;
        indicator = true;
        expResult = -1;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
        
        //test 7
        System.out.println("displayWinLossInfo - test 7");
        totalWins = 0;
        totalLosses = -1;
        indicator = true;
        expResult = -1;
        result = instance.displayWinLossInfo(totalWins, totalLosses, indicator);
        assertEquals(expResult, result, 0.0); 
        
        
    }
}