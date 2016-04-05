
package convertisseurapp;

/**
 *
 * @author Bruno
 */
public class ConvertisseurApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceConvertisseur conv =  new ConvertisseurDevise(Convertisseur.EURO,
                        Convertisseur.DOLLARUS,"100");
        System.out.println(conv.getConversion());
        try{
        conv.setCible(Convertisseur.EURO);
         }catch(ErrorSaisieException ese){
            System.out.println("Saisissez une nouvelle devise cible");
        }
        System.out.println(conv.getConversion());
        try{
        conv.setMontant("1000");
         }catch(ErrorSaisieException ese){
            System.out.println("Saisissez un nouveau montant");
        }
        System.out.println(conv.getConversion());
        try{
        conv.setMontant("truc");
         }catch(ErrorSaisieException ese){
            System.out.println("Saisissez un nouveau montant");
        }
        
        InterfaceConvertisseur conv2 = 
                new ConvertisseurTemperature(Convertisseur.FAHRENHEIT,
                        Convertisseur.CELCIUS,"40");
        System.out.println(conv2.getConversion());
        
        ConvertisseurFrame my_frame = new ConvertisseurFrame();
        
        
        
    }    
}