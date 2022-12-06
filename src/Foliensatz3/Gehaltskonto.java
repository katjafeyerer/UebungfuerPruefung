package Foliensatz3;

public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    private static int gehaltsKontoID;

    public Gehaltskonto(String inhaber, String iban, String bic, double kontostand) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.00;

    }
    //aufbuchen
    public void aufbuchen(double wert){
        if(wert >0){
            kontostand = kontostand + wert;
        }
        else {
            System.out.println("Es kann nicht mehr abgebucht werden, als auf dem Konto verhanden ist");
        }
    }

    //abbuchen
    public void abbuchen(double wert){
        if(wert > 0)
            if(kontostand - wert > 0)
                kontostand = kontostand - wert;
            else
                System.out.println("Abbuchungswert " + wert + " übersteigt Kontostand");
        else
            System.out.println("Wert muss positiv sein");

    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}

