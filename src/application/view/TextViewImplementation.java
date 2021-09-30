/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

/**
 *  Muestra el mensaje por intefaz de Texto
 * @author 2dam
 */
public class TextViewImplementation implements View {
    /**
     * 
     * @param greeting 
     * es el mensaje que muestra
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
