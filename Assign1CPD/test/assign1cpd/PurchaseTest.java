/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assign1cpd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0633176
 */
public class PurchaseTest {
    
    public PurchaseTest() {
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
     * Test of getProductId method, of class Purchase.
     */
    @Test
    public void testGetProductId() {
        System.out.println("getProductId");
        Purchase instance = new Purchase();
        instance.setProductId("123");
        String expResult = "123";
        String result = instance.getProductId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProductId method, of class Purchase.
     */
    @Test
    public void testSetProductId() {
        System.out.println("setProductId");
        String productId = "";
        Purchase instance = new Purchase();
        instance.setProductId(productId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Purchase.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Purchase instance = new Purchase();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Purchase.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Purchase instance = new Purchase();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Purchase.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Purchase instance = new Purchase("123", 500);
        String expResult = "\"productId\": 123, \"quantity\": 500";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
