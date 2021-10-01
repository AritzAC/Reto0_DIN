/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.controler.Controller;
import application.model.ModelFactory;
import application.view.ViewFactory;
import java.util.ResourceBundle;
import static javax.swing.UIManager.getString;

/**
 * Clase principal Aplicación
 * @author Aritz Arrieta y Mikel Matilla
 */
public class Application {
    
    /**
     * Método main
     * @param args 
     */
    public static void main(String[] args) {
        
        String typeM  = ResourceBundle.getBundle("application.controler.config").getString("model");
        String typeV  = ResourceBundle.getBundle("application.controler.config").getString("view");
        
        ModelFactory modelF = new ModelFactory();
        ViewFactory viewF = new ViewFactory();
        
        Controller controller = new Controller();
        controller.run(viewF.getView(typeV), modelF.getModel(typeM));
    }
    
}
