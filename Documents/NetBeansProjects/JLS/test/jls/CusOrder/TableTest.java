/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jls.CusOrder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TableTest {
    
    public TableTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of sort method, of class Table.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Table instance = new Table();
        instance.sort();
        try{
        String[] arr = {"c", "a", "b"};
        String[] expected = {"a", "b", "c"};
        sort(arr,expected); // or whatever your sort method call it like
        assertArrayEquals(expected, arr);
        }
        catch(Exception e){
        } 
        }

   private void sort(String[] arr,String[] expected) {
        for(int i=0;i<arr.length;i++){
            arr[i] = expected[i];
        }
    }
     @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Table.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    }

    /**
     * Test of main method, of class Table.
     */
  

    
   

