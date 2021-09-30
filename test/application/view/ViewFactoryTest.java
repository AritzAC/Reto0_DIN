/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

import application.view.ViewFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    
    @Test
    public void testGetView() {
        ViewFactory viewF = new ViewFactory();
        
        assertNotNull(viewF);
    }
    
}
