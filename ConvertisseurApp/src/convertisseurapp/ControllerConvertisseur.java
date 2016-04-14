/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Jeremy
 */
public class ControllerConvertisseur implements ActionListener {

    private InterfaceView _uic_view;
    private InterfaceConvertisseur _mc_model;
    private Iterator<InterfaceConvertisseur> it;
    private Map<String, String> dict = new HashMap<>();
    private InterfaceConvertisseur localClassDevise = new ConvertisseurDevise();
    private InterfaceConvertisseur localClassTemp = new ConvertisseurTemperature();
    private ArrayList<InterfaceConvertisseur> model;

    public ControllerConvertisseur(ArrayList<InterfaceConvertisseur> model, InterfaceView view) {
        //_mc_model=model;
        this.model = model;
        _uic_view = view;
        _uic_view.abonnerComp(this);

        dict.put("_lb_result_devise", "0");
        dict.put("_lb_result__lb_result_devisetemp", "0");
        dict.put("_lb_info_temp", "Appuyer sur une température");
        dict.put("_lb_info_devise", "Appuyer sur une devise");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        it = model.iterator();
        switch (e.getActionCommand()) {
            case "btn_eur":
                try {
                    while (it.hasNext()) {
                        localClassDevise = it.next();
                        if (localClassDevise instanceof ConvertisseurDevise) {
                            _mc_model = localClassDevise;
                            break;
                        }
                    }
                    _mc_model.setCible(ModelConvertisseur.DOLLARUS);
                    _mc_model.setSource(ModelConvertisseur.EURO);
                    dict.put("_lb_result_devise", _mc_model.getConversion(_uic_view.getDevise()));
                    dict.put("_lb_info_devise", "Convertion en Dollars");
                } catch (ErrorSaisieException ese) {
                    dict.put("_lb_info_devise", "La devise saisie n'est pas correcte");
                    dict.put("_lb_result_devise","");
                } finally {
                    _uic_view.updateUI(dict);
                }
                break;
            case "btn_usd":
                try {
                    while (it.hasNext()) {
                        localClassDevise = it.next();
                        if (localClassDevise instanceof ConvertisseurDevise) {
                            _mc_model = localClassDevise;
                            break;
                        }
                    }
                    _mc_model.setCible(ModelConvertisseur.EURO);
                    _mc_model.setSource(ModelConvertisseur.DOLLARUS);
                    dict.put("_lb_result_devise", _mc_model.getConversion(_uic_view.getDevise()));
                    dict.put("_lb_info_devise", "Convertion en Euro");
                } catch (ErrorSaisieException ese) {
                    dict.put("_lb_info_devise", "La devise saisie n'est pas correcte");
                    dict.put("_lb_result_devise","");
                } finally {
                    _uic_view.updateUI(dict);
                }
                break;
            case "btn_far":
                try {
                    while (it.hasNext()) {
                        localClassTemp = it.next();
                        if (localClassTemp instanceof ConvertisseurTemperature) {
                            _mc_model = localClassTemp;
                            break;
                        }
                    }
                    _mc_model.setCible(ModelConvertisseur.FAHRENHEIT);
                    _mc_model.setSource(ModelConvertisseur.CELCIUS);
                    dict.put("_lb_result_temp", _mc_model.getConversion(_uic_view.getTemperature()));
                    dict.put("_lb_info_temp", "Convertion en Fahrenheit");
                } catch (ErrorSaisieException ese) {
                    dict.put("_lb_info_temp", "La temperature saisie n'est pas correcte");
                    dict.put("_lb_result_temp","");
                } finally {
                    _uic_view.updateUI(dict);
                }
                break;
            case "btn_cel":
                try {
                    while (it.hasNext()) {
                        localClassTemp = it.next();
                        if (localClassTemp instanceof ConvertisseurTemperature) {
                            _mc_model = localClassTemp;
                            break;
                        }
                    }
                    _mc_model.setCible(ModelConvertisseur.CELCIUS);
                    _mc_model.setSource(ModelConvertisseur.FAHRENHEIT);
                    dict.put("_lb_result_temp", _mc_model.getConversion(_uic_view.getTemperature()));
                    dict.put("_lb_info_temp", "Convertion en Celcius");
                } catch (ErrorSaisieException ese) {
                    dict.put("_lb_info_temp", "La temperature saisie n'est pas correcte");
                    dict.put("_lb_result_temp","");
                } finally {
                    _uic_view.updateUI(dict);
                }
                break;
            default:
                System.out.println("Should not come here, get out");
                break;

        }
    }
}
