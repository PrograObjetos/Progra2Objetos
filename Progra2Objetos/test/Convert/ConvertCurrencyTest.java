/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class ConvertCurrencyTest {
    
    public ConvertCurrencyTest() {
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


    @Test
    public void testConvert() {
        ConvertCurrency nconcer = new ConvertCurrency(500);
        System.out.println("convert");
        String tipo = "colones";
        int monto = 4500;
        ConvertCurrency instance = nconcer;
        long expResult = 2250000L;
        long result = instance.convert(tipo, monto);
        assertEquals(expResult, result);
        
    }
    
}
