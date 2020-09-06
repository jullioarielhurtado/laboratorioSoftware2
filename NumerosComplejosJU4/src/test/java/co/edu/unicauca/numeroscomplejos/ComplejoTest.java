/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.numeroscomplejos;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ahurtado
 */
public class ComplejoTest {
    
    private Complejo c;
    
    public ComplejoTest() {
    }
    
  
    
    @Before
    public void setUp() {
         c = new Complejo(10.5,12.3);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pruebaCrearComplejos() {   
        assertEquals(10.0,c.getReal());
        assertEquals(12.3,c.getImaginario());
    }
    
    @Test
    public void pruebaStringComplejos(){
        assertEquals("10.5+12.3i", c.toString());
        c.setReal(20.0);
        assertEquals("21.0+12.3i", c.toString());
        
    }
    
    @Test
    public void pruebaSumaComplejos(){
        Complejo sumando = new Complejo(0.5,1.4);
        c.sumar(sumando);
        assertEquals(11.0,c.getReal(),0.001);
        assertEquals(13.7,c.getImaginario(),0.001);
    }
    
}
