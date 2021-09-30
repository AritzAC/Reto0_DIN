/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.util.ResourceBundle;

/**
 * La implementacion de modelo que recoge los datos desde un Fichero
 * @author 2dam
 */
public class ArchiveModelImplementation implements Model {

    private ResourceBundle messageFile;
    private String message;
    
    
    /**
     * el metodo ArchiveModelImplementation() es para recoger el mensage desde un Fichero (message.propieties)
     */
    public ArchiveModelImplementation() {
        this.messageFile = ResourceBundle.getBundle("application.controler.message");
        this.message = messageFile.getString("message");
        
    }

    @Override
    public String getGreeting() {
        
        this.message = messageFile.getString("message");
        
        return message;
    }

}
