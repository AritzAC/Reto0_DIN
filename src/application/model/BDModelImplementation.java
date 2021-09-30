/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class BDModelImplementation implements Model{
    
    private Connection con;
    private PreparedStatement stmt;
    private ResourceBundle configFile;
    private String driverDB;
    private String urlBD;
    private String userDB;
    private String passDB;
    
    private final String SELECTgreet = "SELECT greet FROM greet";
    
    public BDModelImplementation() {
        this.configFile = ResourceBundle.getBundle("application.controler.BDconfig");
        this.driverDB = configFile.getString("driver");
        this.urlBD = configFile.getString("con");
        this.userDB = configFile.getString("DBUSER");
        this.passDB = configFile.getString("DBPASS");
    }
    
    private void connection() {
        try {
            con = DriverManager.getConnection(this.urlBD, this.userDB, this.passDB);
        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la base de datos");
        }
    }
    
    private void close() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
    
    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String m = null;
        
        this.connection();
        
        try{
            stmt = con.prepareStatement(SELECTgreet);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                m = rs.getString(1);
            }
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }
        try {
            this.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return m;
    }
    
}
