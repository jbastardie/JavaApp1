/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.util.Map;

/**
 *
 * @author Jeremy
 */
public interface InterfaceView {
    public void abonnerComp(ControllerConvertisseur cc);
    public void updateUI(Map<String, String> dict);
    public String getDevise();
    public String getTemperature();
}
