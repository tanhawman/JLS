package jls.Kun;

import ADT.LList;
import jls.Product;
import org.junit.Before;
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
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addRowToJTable method, of class Fresh.
     */
    @Test
    public void testAddRowToJTable() {
        System.out.println("addRowToJTable");
        Fresh instance = new Fresh(ProductList);
        for(int i=1; i<ProductList.getNumberOfEntries(); i++){
            String item = ProductList.getEntry(i).getName();
            assertEquals("Rose", item);
        }
    }
    
}
