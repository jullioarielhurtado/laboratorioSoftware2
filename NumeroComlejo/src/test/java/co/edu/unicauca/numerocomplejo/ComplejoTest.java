/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.numerocomplejo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ahurtado
 */
public class ComplejoTest {
    
    private Complejo c;
    
    public ComplejoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {

    }
    
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       c = new Complejo(10.5,12.3);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void pruebaCrearComplejos() {   
        assertEquals(10.5,c.getReal());
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
