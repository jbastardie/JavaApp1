/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

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
    
    public ModelConvertisseur(){
        super();
    }
    
    public ModelConvertisseur(String s, String c, String m){
        source=s;
        cible=c;
        montant=m;
    }
    
    public void setSource(String s)throws ErrorSaisieException{

        source=s;
        conversionUpdate();

    }
    
    public void setCible(String c)throws ErrorSaisieException{

        cible=c;
        conversionUpdate();

    }
    
    public void setMontant(String m)throws ErrorSaisieException{
        
        montant=m;
        conversionUpdate();
       
    }
    
    public String getConversion(){
        return conversion;
    }
    
    protected void conversionUpdate()throws ErrorSaisieException{
        conversion="";
    }
    
}
