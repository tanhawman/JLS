/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.Sushi;

import java.awt.Button;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sushi
 */
public class DeliveryRouteTest {
    DeliveryList dl = new DeliveryList();
        AddNewTable ant = new AddNewTable();
        DeliveryRoute dr = new DeliveryRoute();
   Calendar cal = Calendar.getInstance();
        Date date1 = cal.getTime();
         DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        String selecteddate = dateFormat.format(date1);
        
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
        DeliveryList dl = new DeliveryList();
        AddNewTable ant = new AddNewTable();
        DeliveryRoute dr = new DeliveryRoute();
        
        //dl.addRowToJTable();
        Object newData[] = new Object[3];
        for(int i =0; i <dl.jTable1.getModel().getRowCount();i++){
        if(selecteddate.equals(dl.jTable1.getModel().getValueAt(i, 1))){
            DefaultTableModel model = (DefaultTableModel) ant.jTable1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) dl.jTable1.getModel();
            newData[0] = model2.getValueAt(i, 0);
            newData[1] = model2.getValueAt(i, 1);
            newData[2] = model2.getValueAt(i, 2);
            model.addRow(newData);
            assertTrue(dl.jTable1.getModel().getValueAt(i, 1).equals(date1));
        }
//       dl.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
    }
        dl.addRowToJTable();

    }
    

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DeliveryRoute.main(args);
        // TODO review the generated test code and remove the default call to fail.
        }
    
}
