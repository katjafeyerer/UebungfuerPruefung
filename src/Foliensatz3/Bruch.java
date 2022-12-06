package Foliensatz3;

public class Bruch {
    private int nenner;
    private int zaehler;



    //Constructor
    public Bruch(int nenner, int zaehler) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    //getter
    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }
    //double toDecimal
    public double toDecimal(double nenner, int zaehler){
        double decimal = nenner / zaehler;
        System.out.println(decimal);
        return decimal;
    }

    //void print
    public void print(int nenner, int zaehler){
        System.out.println(nenner + " / " + zaehler);
    }

    //Bruch multiplicate (bruch b2)
    public Bruch multiplicate(Bruch b2){
        System.out.println(nenner * nenner + " / " + zaehler*zaehler);
        return b2;
    }

    //multiplicate(bruch b2, b3)
    public Bruch multiplicate(Bruch b2, Bruch b3){
        System.out.println("Das ist der Bruch: " + multiplicate(b2).multiplicate(b3));
        return multiplicate(b2).multiplicate(b3);
    }

    @Override
    public String toString() {
        return "Bruch{" +
                "nenner=" + nenner +
                ", zaehler=" + zaehler +
                '}';
    }
}
