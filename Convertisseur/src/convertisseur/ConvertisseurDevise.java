/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur;

import java.util.Scanner;
import org.json.simple.JSONObject;

/**
 *
 * @author Jeremy
 */
public class ConvertisseurDevise implements Interface {

    private float ratio;

    public ConvertisseurDevise() {
    }

    public double convert(float value) {
        return value * ratio;
    }

    public float getValue() {
        Scanner sc;
        String deviseSource;
        String deviseCible;
        sc = new Scanner(System.in);
        JsonParse dataJson = new JsonParse();
        JSONObject data = dataJson.getData();
        do {
            System.out.println("Veuillez saisir la devise source parmi le tableau suivant: " + data.keySet());
            deviseSource = sc.nextLine();
            deviseSource = deviseSource.toUpperCase();
            if(!data.containsKey(deviseSource)){
                System.out.println("Saisie incorrecte");
            }
        } while (!data.containsKey(deviseSource));
        do {
            System.out.print("Veuillez saisir la devise cible: ");
            deviseCible = sc.nextLine();
            deviseCible = deviseCible.toUpperCase();
            if(!data.containsKey(deviseCible)){
                System.out.println("Saisie incorrecte");
            }
        } while (!data.containsKey(deviseCible));
        ratio = getRatio((double)data.get(deviseSource),(double)data.get(deviseCible));
        System.out.print("Selectionner le montant à convertir ");
        return sc.nextFloat();
    }
    
    private float getRatio(double source, double cible){
        return (float)(cible/source);
    }
}
