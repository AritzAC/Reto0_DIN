/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.controler;

import application.model.Model;
import application.view.View;

/**
 * Clase Controller
 * @author Aritz Arrieta y Mikel Matilla
 */
public class Controller {
    
    /**
     * Método para generar la aplicación a partir de la vista y el modelo
     * @param view Vista creada en ViewFactory
     * @param model Modelo creado en ModelFactory
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}
