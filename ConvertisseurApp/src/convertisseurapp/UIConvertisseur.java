/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

import java.awt.*;

/**
 *
 * @author Jeremy
 */
public class UIConvertisseur extends Frame implements InterfaceView {
    
    private Button _bt_eur;
    private Button _bt_usd;
    private Button _bt_far;
    private Button _bt_cel;
    private Label _lb_main_title;
    private Label _lb_info_devise;
    private Label _lb_info_temp;
    private Label _lb_result_devise;
    private Label _lb_result_temp;
    private TextField _tf_devise;
    private TextField _tf_temp;

    /**
     * @return the _bt_eur
     */
    public Button getBt_eur() {
        return _bt_eur;
    }

    /**
     * @param _bt_eur the _bt_eur to set
     */
    public void setBt_eur(Button _bt_eur) {
        this._bt_eur = _bt_eur;
    }

    /**
     * @return the _bt_usd
     */
    public Button getBt_usd() {
        return _bt_usd;
    }

    /**
     * @param _bt_usd the _bt_usd to set
     */
    public void setBt_usd(Button _bt_usd) {
        this._bt_usd = _bt_usd;
    }

    /**
     * @return the _bt_far
     */
    public Button getBt_far() {
        return _bt_far;
    }

    /**
     * @param _bt_far the _bt_far to set
     */
    public void setBt_far(Button _bt_far) {
        this._bt_far = _bt_far;
    }

    /**
     * @return the _bt_cel
     */
    public Button getBt_cel() {
        return _bt_cel;
    }

    /**
     * @param _bt_cel the _bt_cel to set
     */
    public void setBt_cel(Button _bt_cel) {
        this._bt_cel = _bt_cel;
    }

    /**
     * @return the _lb_main_title
     */
    public Label getLb_main_title() {
        return _lb_main_title;
    }

    /**
     * @param _lb_main_title the _lb_main_title to set
     */
    public void setLb_main_title(Label _lb_main_title) {
        this._lb_main_title = _lb_main_title;
    }

    /**
     * @return the _lb_info_devise
     */
    public Label getLb_info_devise() {
        return _lb_info_devise;
    }

    /**
     * @param _lb_info_devise the _lb_info_devise to set
     */
    public void setLb_info_devise(Label _lb_info_devise) {
        this._lb_info_devise = _lb_info_devise;
    }

    /**
     * @return the _lb_info_temp
     */
    public Label getLb_info_temp() {
        return _lb_info_temp;
    }

    /**
     * @param _lb_info_temp the _lb_info_temp to set
     */
    public void setLb_info_temp(Label _lb_info_temp) {
        this._lb_info_temp = _lb_info_temp;
    }

    /**
     * @return the _lb_result_devise
     */
    public Label getLb_result_devise() {
        return _lb_result_devise;
    }

    /**
     * @param _lb_result_devise the _lb_result_devise to set
     */
    public void setLb_result_devise(Label _lb_result_devise) {
        this._lb_result_devise = _lb_result_devise;
    }

    /**
     * @return the _lb_result_temp
     */
    public Label getLb_result_temp() {
        return _lb_result_temp;
    }

    /**
     * @param _lb_result_temp the _lb_result_temp to set
     */
    public void setLb_result_temp(Label _lb_result_temp) {
        this._lb_result_temp = _lb_result_temp;
    }

    /**
     * @return the _tf_devise
     */
    public TextField getTf_devise() {
        return _tf_devise;
    }

    /**
     * @param _tf_devise the _tf_devise to set
     */
    public void setTf_devise(TextField _tf_devise) {
        this._tf_devise = _tf_devise;
    }

    /**
     * @return the _tf_temp
     */
    public TextField getTf_temp() {
        return _tf_temp;
    }

    /**
     * @param _tf_temp the _tf_temp to set
     */
    public void setTf_temp(TextField _tf_temp) {
        this._tf_temp = _tf_temp;
    }
    
    
    
}
