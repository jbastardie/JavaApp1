
package convertisseurapp;


/**
 *
 * @author Bruno
 */
public interface InterfaceConvertisseur {
    public void setSource(String s);
    public void setCible(String c);
    public void setMontant(String m);
    public String getConversion(String value);
}
