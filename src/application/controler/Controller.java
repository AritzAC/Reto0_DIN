/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.controler;

import application.model.Model;
import application.view.View;

/**
 *
 * @author Aritz Arrieta y Mikel Matilla
 */
public class Controller {
    
    /**
     * 
     * @param view
     * @param model 
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}
