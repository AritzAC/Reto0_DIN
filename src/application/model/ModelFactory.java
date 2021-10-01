/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author Aritz Arrieta y Mikel Matilla
 */
public class ModelFactory {
    
    public Model getModel(String typeM) {
        Model model = null;
        
        switch (typeM) {
            case "Archive":
                model = new ArchiveModelImplementation();
                break;
                
            case "BD":
                model = new BDModelImplementation();
                break;
                
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
        return model;
    }
}
