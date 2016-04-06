/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author yannc
 */
public class EventExterne implements ActionListener {

    private ConvertisseurFrame ihm;

    public EventExterne(ConvertisseurFrame ihm) {
        this.ihm = ihm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Action a effectuer
        switch (e.getActionCommand()) {
            case "btn_eur":
                try {
                    ihm._lb_info_devise.setText("Convertion en Euro");
                    InterfaceConvertisseur conv = new ConvertisseurDevise(Convertisseur.DOLLARUS,
                            Convertisseur.EURO, ihm._tf_devise.getText());
                    ihm._lb_result_devise.setText(conv.getConversion());
                    ihm._lb_result_devise.revalidate();
                } catch (ErrorSaisieException ese) {
                    ihm._lb_info_devise.setText("La devise saisie n'est pas correcte");
                    ihm._lb_info_devise.revalidate();
                }
                break;
            case "btn_usd":
                try {
                    ihm._lb_info_devise.setText("Convertion en Dollar");
                    InterfaceConvertisseur conv2 = new ConvertisseurDevise(Convertisseur.EURO,
                            Convertisseur.DOLLARUS, ihm._tf_devise.getText());
                    ihm._lb_result_devise.setText(conv2.getConversion());
                    ihm._lb_result_devise.revalidate();
                } catch (ErrorSaisieException ese) {
                    ihm._lb_info_devise.setText("La devise saisie n'est pas correcte");
                    ihm._lb_info_devise.revalidate();
                }
                break;
            case "btn_far":
                try {
                    ihm._lb_info_temp.setText("Convertion en Farenheit");
                    InterfaceConvertisseur conv3 = new ConvertisseurTemperature(Convertisseur.CELCIUS,
                            Convertisseur.FAHRENHEIT, ihm._tf_temp.getText());
                    ihm._lb_result_temp.setText(conv3.getConversion());
                    ihm._lb_result_temp.revalidate();
                } catch (ErrorSaisieException ese) {
                    ihm._lb_info_temp.setText("La température saisie n'est pas correcte");
                    ihm._lb_info_temp.revalidate();
                }
                break;
            case "btn_cel":
                try {
                    ihm._lb_info_temp.setText("Convertion en Celsius");
                    InterfaceConvertisseur conv4 = new ConvertisseurTemperature(Convertisseur.FAHRENHEIT,
                            Convertisseur.CELCIUS, ihm._tf_temp.getText());
                    ihm._lb_result_temp.setText(conv4.getConversion());
                    ihm._lb_result_temp.revalidate();
                } catch (ErrorSaisieException ese) {
                    ihm._lb_info_temp.setText("La température saisie n'est pas correcte");
                    ihm._lb_info_temp.revalidate();
                }
                break;
            default:
                System.out.println("Should not come here, get out");
                break;

        }

    }

}
