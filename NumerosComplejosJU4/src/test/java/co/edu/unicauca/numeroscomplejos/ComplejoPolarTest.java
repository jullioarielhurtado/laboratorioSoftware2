/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.numeroscomplejos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahurtado
 */
public class ComplejoPolarTest {
    
    public ComplejoPolarTest() {
    }

    @Test
    public void testConstructor() {
        ComplejoPolar ComplejoPolar = new ComplejoPolar(new Complejo(0.0,0.0));
        assertTrue(true);
    }
    
}
