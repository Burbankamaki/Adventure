/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

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
public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of displayFightScene method, of class Animal.
     */
    @Test
    //test1
    public void testDisplayFightScene() {
        //test1
        System.out.println("displayFightScene");
        double healthPoints = 1.0;
        Animal instance = new Animal();
        double expResult = -2.0;
        double result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);

        
        
        
        //test2
        System.out.println("displayFightScene");
        healthPoints = 99999.0;
        expResult = -2.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
        
        
        //test3
        System.out.println("displayFightScene");
        healthPoints = -1.0;
        expResult = -1.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
        
        
        //test4
        System.out.println("displayFightScene");
        healthPoints = -99999.0;
        expResult = -1.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
        
        
        //test5
        System.out.println("displayFightScene");
        healthPoints = 0.0;
        expResult = -1.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
        
        
        //test6
        System.out.println("displayFightScene");
        healthPoints = 35.0;
        expResult = -2.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
        
        
        //test7
        System.out.println("displayFightScene");
        healthPoints = 156.0;
        expResult = -2.0;
        result = instance.displayFightScene(healthPoints);
        assertEquals(expResult, result, 0.0);
    }

}