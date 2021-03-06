package convertisseurapp;

import java.util.Map;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author Bruno
 */
public class ConvertisseurDevise extends ModelConvertisseur implements
        InterfaceConvertisseur {
    Map<String, Float> tx;

    public ConvertisseurDevise(Properties prop) throws ErrorConnectDB{
        /* Initialisation des paramètres de conversion
        *  Appel au constructeur de la classe mère "super"
         */
       // super(s, c, m);

        /* Initialisation du référentiel des taux. Ce dernier peut être
        *  construit via une source externe (Base de données, fichier XML).
        *  Ici la matrice porte le sens et le taux. La gestion par devise 
        *  de référence est aussi possible.
         */
//        tx = new HashMap<>();
//        tx.put(ModelConvertisseur.DOLLARUS + ModelConvertisseur.DOLLARUS, new Float(1));
//        tx.put(ModelConvertisseur.EURO + ModelConvertisseur.EURO, new Float(1));
//        tx.put(ModelConvertisseur.DOLLARUS + ModelConvertisseur.EURO, new Float(0.87));
//        tx.put(ModelConvertisseur.EURO + ModelConvertisseur.DOLLARUS, new Float(1.13));

           tx = super.getHashMap(prop);
        /* Lorsque les attributs de classe sont initialisés on exécute la 
        *  conversion
         */
    }

    private void convertir() throws ErrorSaisieException, ErrorConnectDB {
        try {
            float resultat;
            resultat = Float.parseFloat(this.montant) * tx.get(this.source
                    + this.cible);
            this.conversion = Float.toString(resultat);
            
        } catch (NumberFormatException nfe) {
            throw new ErrorSaisieException(this.montant);
        }catch(NullPointerException npe){
            throw new ErrorConnectDB();
        }
    }

    @Override
    protected void conversionUpdate() throws ErrorSaisieException, ErrorConnectDB {
        this.convertir();
    }
}
