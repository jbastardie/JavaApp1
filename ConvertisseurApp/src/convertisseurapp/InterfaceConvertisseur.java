
package convertisseurapp;


/**
 *
 * @author Bruno
 */
public interface InterfaceConvertisseur {
    public void setSource(String s);
    public void setCible(String c);
    public void setMontant(String m)throws ErrorSaisieException, ErrorConnectDB;
    public String getConversion(String value) throws ErrorConnectDB;
}
