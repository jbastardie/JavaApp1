///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package convertisseurapp;
//
//import java.awt.*;
//
///**
// *
// * @author yannc
// */
////class de notre interface
//public class ConvertisseurFrame extends Frame{
//    Button _bt_eur= new Button("€ vers $");
//    Button _bt_usd= new Button("$ vers €");
//    Button _bt_far= new Button("°C vers °F");
//    Button _bt_cel= new Button("°F vers °C");
//    Label _lb_main_title= new Label("Convertisseur");
//    Label _lb_info_devise= new Label("Appuyer sur une devise");
//    Label _lb_info_temp= new Label("Appuyer sur une température");
//    Label _lb_result_devise= new Label("0");
//    Label _lb_result_temp= new Label("0");
//    TextField _tf_devise=new TextField("Valeur à convertir");
//    TextField _tf_temp=new TextField("Valeur à convertir");
//    
//    public ConvertisseurFrame(){
//        
//        _bt_eur.setActionCommand("btn_eur");
//        _bt_usd.setActionCommand("btn_usd");
//        _bt_far.setActionCommand("btn_far");
//        _bt_cel.setActionCommand("btn_cel");
//        
//        setLayout(new BorderLayout());
//        
//        Panel p1 = new Panel();
//        Panel p2 = new Panel();
//        Panel p3 = new Panel();
//        add(p1,"North");
//        add(p2,"West");
//        add(p3,"South");
//
//        p1.add(_lb_main_title);
//        p2.add(_tf_devise);
//        p2.add(_bt_eur);
//        p2.add(_bt_usd);
//        p2.add(_lb_info_devise);
//        p2.add(_lb_result_devise);
//        p3.add(_tf_temp);
//        p3.add(_bt_far);
//        p3.add(_bt_cel);
//        p3.add(_lb_info_temp);
//        p3.add(_lb_result_temp);
//        pack();
//        this.setVisible(true);
//        _bt_eur.addActionListener(new EventExterne(this));
//        _bt_usd.addActionListener(new EventExterne(this));
//        _bt_far.addActionListener(new EventExterne(this));
//        _bt_cel.addActionListener(new EventExterne(this));
//        
//    }
//}
//    
//
