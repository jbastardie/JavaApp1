/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.awt.*;
import java.util.Map;

/**
 *
 * @author Jeremy
 */
public class UIConvertisseur extends Frame implements InterfaceView {

    protected Button _bt_eur = new Button("€ vers $");
    protected Button _bt_usd = new Button("$ vers €");
    protected Button _bt_far = new Button("°C vers °F");
    protected Button _bt_cel = new Button("°F vers °C");
    protected Label _lb_main_title = new Label("Convertisseur");
    protected Label _lb_info_devise = new Label("Appuyer sur une devise");
    protected Label _lb_info_temp = new Label("Appuyer sur une température");
    protected Label _lb_result_devise = new Label("0");
    protected Label _lb_result_temp = new Label("0");
    protected TextField _tf_devise = new TextField("Valeur à convertir");
    protected TextField _tf_temp = new TextField("Valeur à convertir");

    public UIConvertisseur() {

        _bt_eur.setActionCommand("btn_eur");
        _bt_usd.setActionCommand("btn_usd");
        _bt_far.setActionCommand("btn_far");
        _bt_cel.setActionCommand("btn_cel");

        setLayout(new BorderLayout());

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        add(p1, "North");
        add(p2, "West");
        add(p3, "South");

        p1.add(_lb_main_title);
        p2.add(_tf_devise);
        p2.add(_bt_eur);
        p2.add(_bt_usd);
        p2.add(_lb_info_devise);
        p2.add(_lb_result_devise);
        p3.add(_tf_temp);
        p3.add(_bt_far);
        p3.add(_bt_cel);
        p3.add(_lb_info_temp);
        p3.add(_lb_result_temp);

        pack();
        this.setVisible(true);
    }

    @Override
    public void abonnerComp(ControllerConvertisseur cc) {

        _bt_eur.addActionListener(cc);
        _bt_usd.addActionListener(cc);
        _bt_far.addActionListener(cc);
        _bt_cel.addActionListener(cc);

    }

    @Override
    public void updateUI(Map<String, String> dict) {
        //A modifier pour boucler tout ca
        _lb_info_devise.setText(dict.get("_lb_info_devise"));
        _lb_info_temp.setText(dict.get("_lb_info_temp"));
        _lb_result_devise.setText(dict.get("_lb_result_devise"));
        _lb_result_temp.setText(dict.get("_lb_result_temp"));
        _lb_info_devise.revalidate();
        _lb_info_temp.revalidate();
        _lb_result_devise.revalidate();
        _lb_result_temp.revalidate();
        pack();
    }

    @Override
    public String getDevise() {
        return _tf_devise.getText();
    }

    @Override
    public String getTemperature() {
        return _tf_temp.getText();
    }
}
