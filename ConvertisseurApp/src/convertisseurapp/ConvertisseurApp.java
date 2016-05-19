
package convertisseurapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
/**
 *
 * @author Bruno
 */
public class ConvertisseurApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Properties prop = new Properties();
	InputStream input = null;
            try {
                //ResourceBundle props = ResourceBundle.getBundle("resources.config");
		//input = new FileInputStream("resources.config.properties");
                input = ConvertisseurApp.class.getClassLoader().getResourceAsStream("resources/config.properties");
		// load a properties file
		prop.load(input);
		// get the property value and print it out
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("login"));
		System.out.println(prop.getProperty("pass"));
                System.out.println(prop.getProperty("bdd"));

            } catch (IOException ex) {
		ex.printStackTrace();
            } finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
        Locale loc = new Locale(prop.getProperty("pays"),prop.getProperty("langue"));
        ResourceBundle rb  = ResourceBundle.getBundle("resources/resources", loc);
        System.out.println(rb.getString("Label1"));
        ArrayList<InterfaceConvertisseur> listConv =new ArrayList<InterfaceConvertisseur>();
        InterfaceView view = new UIConvertisseur();
        try{
            listConv.add( new ConvertisseurDevise(prop));
        }catch(ErrorConnectDB ecdb){
            view.showpopup("erreur deconnexion à la BDD");
        }
        listConv.add( new ConvertisseurTemperature(prop));
        ControllerConvertisseur controller = new ControllerConvertisseur(listConv, view);
    }    
}