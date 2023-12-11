/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteTest {
    
 
    Teste test = new Teste();
    @Test
    public void testMETODO() {
      
        
        assertEquals(10,test.metodoSOMA(5,5));
    }
    
     @Test
    public void testMETODOSUB() {
      
    assertEquals(0,test.metodoSUB(5,5));
    }
    
     @Test
    public void testMETODODIV() {
      
      assertEquals(5,test.metodoDIVISAO(10,2));
        
    }
    @Test
    public void testDIVporZERO(){
        
    test.metodoDIVISAO(10,0);
}
    
       @Test
    public void testMETODOMULTI() {
      
   assertEquals(8,test.metodoMULTIPLICACAO(4,2));
    }
    
    
    
}
