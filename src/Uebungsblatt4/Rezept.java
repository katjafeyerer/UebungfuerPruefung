package Uebungsblatt4;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten; // initializer nicht so wirklich klar


    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;

    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println("Name: " + this.name);
        System.out.println("Personen: " + this.personen);
        System.out.println("Zutaten: " );
        for (int i = 0; i < this.zutaten.length; i++) {
            System.out.println(this.zutaten[i].toString());

        }
    }
    public Rezept umrechnen(int personen){
        double faktor = personen / (getPersonen() * 1.0);
        Zutat[] neueZutaten = new Zutat[this.zutaten.length];

        for (int i = 0; i < this.zutaten.length; i++) {
            neueZutaten[i] = new Zutat(this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge()*faktor));

        }
        Rezept neu = new Rezept(this.name, personen, neueZutaten);

        return neu;


       // 100 Gramm für 2 Personen
       // 200 Gramm für 4 Personen
       // Methode liefert neues Objekt der Klasse Rezept zurück
       // ursprüngliches Rezept nicht verändert
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
