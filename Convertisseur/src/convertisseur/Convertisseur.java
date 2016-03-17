/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        JsonParse data = new JsonParse();
        data.getData();
        Interface myInterface;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("voulez vous convertir une température ou une devise (1/2):");
        if (sc.nextInt() == 1) {
            myInterface = new ConvertisseurTemp();
            System.out.println("La température en °F: " + myInterface.convert(myInterface.getValue()));
        } else {
            myInterface = new ConvertisseurDevise();
            System.out.println("Le montant converti: " + myInterface.convert(myInterface.getValue()));
        }
    }
}
