/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseurapp;

/**
 *
 * @author yannc
 */
//class de notre error custom
public class ErrorSaisieException extends NumberFormatException {
    public ErrorSaisieException(String s){
        super("Value is "+s);
    }
}
