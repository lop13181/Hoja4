/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1210la
 */
public class PilaListaTest {
    
    public PilaListaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of size method, of class PilaLista.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PilaLista instance = new PilaLista();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class PilaLista.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        PilaLista instance = new PilaLista();
        instance.add(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class PilaLista.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        PilaLista instance = new PilaLista();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PilaLista.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        PilaLista instance = new PilaLista();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class PilaLista.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaLista instance = new PilaLista();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class PilaLista.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        PilaLista instance = new PilaLista();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class PilaLista.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        PilaLista instance = new PilaLista();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class PilaLista.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilaLista instance = new PilaLista();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class PilaLista.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        PilaLista instance = new PilaLista();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
