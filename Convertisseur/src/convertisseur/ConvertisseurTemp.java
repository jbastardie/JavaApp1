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
public class ConvertisseurTemp implements Interface {

    public double convert(float value) {
        return value*1.8 + 32;
    }
    
    public float getValue(){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Veuillez saisir la température en °C: ");
        return sc.nextFloat();
    }
}
