package Uebungsblatt4;

public class RezeptDemo {
    public static void main(String[] args) {

        Zutat butter = new Zutat("Butter", 250);
        Zutat zucker = new Zutat("Zucker", 250);
        Zutat omasGeheimZutat = new Zutat("Feenstaub", 100);

        System.out.println(butter.toString());
        System.out.println(omasGeheimZutat.toString());
        System.out.println(omasGeheimZutat.toString());


        Zutat mehl = new Zutat("Mehl 480 Universal", 250);
        System.out.println();


        Zutat[] zutaten = {butter, zucker, mehl, omasGeheimZutat};
        System.out.println();

        Rezept weihnachtsKeks = new Rezept("Weihnachts Keks light", 4, zutaten);
        weihnachtsKeks.printRezept();

        Rezept wk10 = weihnachtsKeks.umrechnen(10);
        wk10.printRezept();
        weihnachtsKeks.printRezept();


    }
}
