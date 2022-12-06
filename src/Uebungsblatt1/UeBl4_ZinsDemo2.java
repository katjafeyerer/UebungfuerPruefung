package Uebungsblatt1;

public class UeBl4_ZinsDemo2 {
        public static void main(String[] args) {
            int kontostand= 1000;
            double zinsen = 0.0225;
            double zins = 2.25;

            kontostandEnde(1000, 2.25);

        }

        public static double kontostandEnde(double kontostand, double zinsen){
            return kontostand= (kontostand/100)*zinsen;
        }


    }
