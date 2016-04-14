
package convertisseurapp;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ConvertisseurApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<InterfaceConvertisseur> listConv =new ArrayList<InterfaceConvertisseur>();
        listConv.add( new ConvertisseurDevise());
        listConv.add( new ConvertisseurTemperature());
        InterfaceView view = new UIConvertisseur();
        ControllerConvertisseur controller = new ControllerConvertisseur(listConv, view);
    }    
}