/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Kun;

import ADT.LList;
import java.util.ArrayList;
import jls.Product;
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
    LList<Product> ProductList = new LList<>();
    Fresh f = new Fresh(ProductList);
    
    String item;
   
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
        
       
    }

    /**
     * Test of ListItem method, of class Fresh.
     */
    @Test
    public void testListItem() {
        
        System.out.println("ListItem");
        Fresh instance = new Fresh(ProductList);
        for(int i=1; i<ProductList.getNumberOfEntries(); i++){
            String item = ProductList.getEntry(i).getName();
            assertEquals("Rose", item);
        }
        
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addRowToJTable method, of class Fresh.
     */
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        Fresh instance = new Fresh(ProductList);
        instance.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
