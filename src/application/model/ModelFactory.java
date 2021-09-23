/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFactory {

    

    public Model getModel(String typeM) {
        Model m = null;

      
        /*
        dependiendo del  valor de model , que nos devuelva del properties, 
        crea una una implementacion u otra.
         */
        switch (typeM) {
            case "Archive":
                m = new ArchiveModelImplementation();
                break;
            case "BD":
                m = new BDModelImplementation();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        return m;
    }
}
