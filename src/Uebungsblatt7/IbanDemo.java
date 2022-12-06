/*package Uebungsblatt7;

public class IbanDemo {
    public static void main(String[] args) {
        //Objekt anlegen
        IbanValidierung iban1 = new IbanValidierung("AT611904300234573201");

        //System.out.println(iban1.toString());
        //Ausgabe
        System.out.println("Eingabe von iban: ");
        System.out.println(iban1.getAccountNumber("AT611904300234573201"));

        System.out.println();
        String laendercode= iban1.getCountryCode(iban1.getAccountNumber("AT611904300234573201"));
        System.out.println("Laendercode: " + laendercode);

        String pruefsumme = iban1.getCheckSum(iban1.getAccountNumber(iban1.getIban()));
        System.out.println("Pruefsumme: " + pruefsumme);

        System.out.println("Kontonummer: " + iban1.getAccountNumber(iban1.getIban()));

        System.out.println();
        System.out.println("Prüfzahl: " + iban1.getFullCode());

        System.out.println(iban1.calcCheckSum());

        System.out.println( iban1.calcCheckSum());
        System.out.println(iban1.isIbanCorrect());
    }

}*/
