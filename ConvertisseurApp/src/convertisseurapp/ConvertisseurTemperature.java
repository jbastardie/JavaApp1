package convertisseurapp;

/**
 *
 * @author Bruno
 */
public class ConvertisseurTemperature extends ModelConvertisseur implements
        InterfaceConvertisseur {

    public ConvertisseurTemperature() {

    }

    private void convertir() throws ErrorSaisieException {
        try {
            float resultat = 0;
            String sens = this.source + this.cible;
            if (sens.matches(Convertisseur.FAHRENHEIT + Convertisseur.CELCIUS)) {
                resultat = (Float.parseFloat(this.montant) - 32) * 5 / 9;
            }
            if (sens.matches(Convertisseur.CELCIUS + Convertisseur.FAHRENHEIT)) {
                resultat = Float.parseFloat(this.montant) * 9 / 5 + 32;
            }
            this.conversion = Float.toString(resultat);
        } catch (NumberFormatException nfe) {
            System.out.println("Error detected:  " + nfe);
            throw new ErrorSaisieException(this.montant);
        }
    }

    @Override
    protected void conversionUpdate() throws ErrorSaisieException {
        this.convertir();
    }

}
