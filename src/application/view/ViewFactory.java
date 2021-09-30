/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.view;

/**
 *
 * @author Aritz Arrieta y Mikel Matilla
 */
public class ViewFactory {
    
    public View getView(String typeV) {
        View view = null;
        
        switch (typeV) {
        case "Text":
            view = new TextViewImplementation();
            break;
            
        case "Swing":
            view = new SwingViewImplementation();
            break;
            
        case "JavaFX":
            view = new JavaFXViewImplementation();
            break;
        default:
            System.out.println("Opcion invalida");
            break;
    }
        
        return view;
    }
    
}
