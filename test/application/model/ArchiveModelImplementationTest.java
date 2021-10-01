/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Aritz Arrieta y Mikel Matilla
 */
public class ArchiveModelImplementationTest {
    
    @Test
    public void testGetGreeting() {
        Model archiveModel = new ArchiveModelImplementation();
        String greeting = "Hola Mundo Archivo";
        
        assertEquals(greeting, archiveModel.getGreeting());
    }
}
