package convertisseurapp;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Bruno
 */
public class ConvertisseurDevise extends ModelConvertisseur implements
        InterfaceConvertisseur {

    Map<String, Float> tx;

    public ConvertisseurDevise() {

        /* Initialisation des paramètres de conversion
        *  Appel au constructeur de la classe mère "super"
         */
       // super(s, c, m);

        /* Initialisation du référentiel des taux. Ce dernier peut être
        *  construit via une source externe (Base de données, fichier XML).
        *  Ici la matrice porte le sens et le taux. La gestion par devise 
        *  de référence est aussi possible.
         */
        tx = new HashMap<>();
        tx.put(Convertisseur.DOLLARUS + Convertisseur.DOLLARUS, new Float(1));
        tx.put(Convertisseur.EURO + Convertisseur.EURO, new Float(1));
        tx.put(Convertisseur.DOLLARUS + Convertisseur.EURO, new Float(0.87));
        tx.put(Convertisseur.EURO + Convertisseur.DOLLARUS, new Float(1.13));

        /* Lorsque les attributs de classe sont initialisés on exécute la 
        *  conversion
         */
    }

    private void convertir() throws ErrorSaisieException {
        try {

            float resultat;
            resultat = Float.parseFloat(this.montant) * tx.get(this.source
                    + this.cible);
            this.conversion = Float.toString(resultat);

        } catch (NumberFormatException nfe) {
            System.out.println("Error detected:  " + nfe);
            throw new ErrorSaisieException(this.montant);

        }
    }

    @Override
    protected void conversionUpdate() throws ErrorSaisieException {
        this.convertir();
    }
}
