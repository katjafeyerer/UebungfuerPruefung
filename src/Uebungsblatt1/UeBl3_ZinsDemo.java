package Uebungsblatt1;

public class UeBl3_ZinsDemo {
    public static void main(String[] args) {
        int kontostand= 1000;
        double zinsen = 0.0225;
        double zins = 2.25;

        double kontostandEnde = kontostand*zinsen;
        double kontostandende = kontostand / 100 *zins;

        System.out.println(kontostandEnde);
        System.out.println(kontostandende);

    }


}
