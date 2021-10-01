/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 * Implementacion del modelo que recoge los datos desde un Fichero
 * @author Aritz Arrieta y Mikel Matilla
 */
public class ArchiveModelImplementation implements Model {

    private ResourceBundle messageFile;
    private String message;
    
    
    /**
     * Método para recoger el mensage desde un fichero
     */
    public ArchiveModelImplementation() {
        this.messageFile = ResourceBundle.getBundle("application.controler.message");
        this.message = messageFile.getString("message");
        
    }

    /**
     * Método para devolver un saludo
     * @return Devuelve el mensaje
     */
    @Override
    public String getGreeting() {
        this.message = messageFile.getString("message");
        
        return message;
    }
}
