/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jeremy
 */
public class ControllerConvertisseur implements ActionListener{
    
    private InterfaceView _uic_view;
    private InterfaceConvertisseur _mc_model;
    
    public ControllerConvertisseur(InterfaceConvertisseur model, InterfaceView view){
        _mc_model=model;
        _uic_view=view;
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
