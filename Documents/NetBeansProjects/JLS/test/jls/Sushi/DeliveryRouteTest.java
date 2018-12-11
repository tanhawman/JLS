/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Sushi;

import java.awt.Button;
import javax.swing.JPanel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sushi
 */
public class DeliveryRouteTest {
    
    public DeliveryRouteTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of main method, of class DeliveryRoute.
     */
    
    
    @Test
    public void testGetTheArrayList() {
        System.out.println("get the array list");
        String[] array1 = {"O001","21/12/18","100"};
        String[] array2 = {"O001","21/12/18","100"};
        assertArrayEquals(array1,array2);
        assertSame(array2, array2);
    }  
    
    @Test
    public void testGetTheSameDate() {
        System.out.println("get the same date ");
        String date = "18/12/18";
        String selecteddate = "18/12/18";
        assertEquals(date,selecteddate);
    }
    
    
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        DeliveryList dladdrow = new DeliveryList();
        dladdrow.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
    }
    

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DeliveryRoute.main(args);
        // TODO review the generated test code and remove the default call to fail.
        }
    
}
