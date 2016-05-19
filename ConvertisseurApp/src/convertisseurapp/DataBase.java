/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Jeremy
 */
public class DataBase {
    private Connection conn;
    
//    public DataBase(){
//        driver = "org.apache.derby.jdbc.ClientDriver";
//        bdd = "jdbc:derby://localhost:1527/DeviseBDD";
//        login = "login";
//        pass = "pass";
//        conn = null;
//    }
    
    public void connectDB(Properties properties) throws ErrorConnectDB{
        boolean ok = false;
        try{
            //charge le pilote
            Class.forName(properties.getProperty("driver"));
            //crée la connection
            conn = DriverManager.getConnection(properties.getProperty("bdd"), properties.getProperty("login"), properties.getProperty("pass"));
            ok = true;
        }catch(ClassNotFoundException | SQLException error){
            throw new ErrorConnectDB();
        }
    }
    
    public void closeDB() throws SQLException{
        if (conn != null){
            conn.close();
        }
    }
    
    public Map<String, Float> getHashMap() throws SQLException{
        Map<String, Float> tx;
        tx = new HashMap<>();
        String sql ="SELECT * FROM LOGIN.DEVISE_NOM";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            tx.put(rs.getString("ID_DEVISE_SOURCE") + rs.getString("ID_DEVISE_CIBLE"), rs.getFloat("TX_CONVERSION"));
        }
        return tx;
    }   
}
