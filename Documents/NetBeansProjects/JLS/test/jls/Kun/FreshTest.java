/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yee Kun
 */

public class FreshTest {
    Fresh f = new Fresh();
    
   ArrayList<Fresh.Item> itemList = new ArrayList<Fresh.Item>();
   
    public FreshTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
       itemList= f.ListItem();
    }

    /**
     * Test of ListItem method, of class Fresh.
     */
    @Test
    public void testListItem() {
        
        System.out.println("ListItem");
        Fresh instance = new Fresh();
        
        assertEquals("Rose", itemList.get(0).item);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addRowToJTable method, of class Fresh.
     */
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        Fresh instance = new Fresh();
        instance.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
