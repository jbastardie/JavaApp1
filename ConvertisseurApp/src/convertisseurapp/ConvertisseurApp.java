
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
        //ConvertisseurFrame my_frame = new ConvertisseurFrame();
        InterfaceConvertisseur model = new ModelConvertisseur();
        Interf view = new UIConvertisseur();
        ControllerConvertisseur controller = new ControllerConvertisseur(model, view);
    }    
}