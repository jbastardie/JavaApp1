/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Jeremy
 */
public class ModelConvertisseur implements InterfaceConvertisseur{

       // Classe mère
    
    // Références dans éléments à convertir
    public static String DOLLARUS="USD";
    public static String EURO="EUR";
    public static String CELCIUS="C";
    public static String FAHRENHEIT="F";
    
    protected String source;
    protected String cible;
    protected String montant;
    protected String conversion;
    
    protected Properties properties;
    protected DataBase dataBase = new DataBase();
    
    public ModelConvertisseur(){
        super();
    }
    
    
    public void setSource(String s)throws ErrorSaisieException{

        source=s;
        

    }
    
    public void setCible(String c)throws ErrorSaisieException{

        cible=c;

    }
    
    public void setMontant(String m)throws ErrorSaisieException, ErrorConnectDB{
        
        montant=m;
        conversionUpdate();
       
    }
    
    public String getConversion(String value) throws ErrorConnectDB{
        montant=value;
        conversionUpdate();
        return conversion;
    }
    
    protected void conversionUpdate()throws ErrorSaisieException, ErrorConnectDB{
        conversion="";
    }
    
    public Map<String, Float> getHashMap(Properties properties) throws ErrorConnectDB{
        Map<String, Float> tx =new HashMap<>();
           dataBase.connectDB(properties);
        try{
        tx = dataBase.getHashMap();
        }catch(SQLException ex){
           throw new ErrorConnectDB();
        }
        try{
            dataBase.closeDB();
        }catch(SQLException ex){
            throw new ErrorConnectDB();
        }
        return tx;
    }
    
}
