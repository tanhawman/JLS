/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Sushi;

import ADT.LList;
import jls.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sushi
 */
public class DeliveryRouteTest {
    LList<Order> OrderList = new LList<>();
    DeliveryList dl = new DeliveryList(OrderList);
    DeliveryRoute dr = new DeliveryRoute(OrderList);
    
    @Before
    public void setUp() {
    }
    
    
    @Test
    public void testStatusList() {
        System.out.println("List the status with pending");
        for(int i=1; i<OrderList.getNumberOfEntries(); i++){
            String status = OrderList.getEntry(i).getStatus();
            assertEquals("Pending", status);
        }
    }
    
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        dl.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
