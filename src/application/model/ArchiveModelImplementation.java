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
public class ArchiveModelImplementation implements Model {

    private ResourceBundle messageFile;
    private String message;
    
    
    
    public ArchiveModelImplementation() {
        this.messageFile = ResourceBundle.getBundle("control.message");
        this.message = messageFile.getString("message");
        
    }

    @Override
    public String getGreeting() {
        String e = null;
        return e;
    }

}