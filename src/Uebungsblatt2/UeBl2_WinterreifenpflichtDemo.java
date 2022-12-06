package Uebungsblatt2;

public class UeBl2_WinterreifenpflichtDemo {
    public static void main(String[] args) {

        //isWinterreifenPflicht(7, false);
        //isWinterreifenPflicht(4, false);
        //isWinterreifenPflicht(4, true);

        //printResult(isWinterreifenPflicht(4, true));
        //printResult(isWinterreifenPflicht(4, false));
        printsResult(itsWinterreifenPflicht(4, false));
        printsResult(itsWinterreifenPflicht(12, false));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        if (temperatur < 10 && rutschigeFahrbahn == true) {
            return true;
        }
        else if (temperatur < 4) {
            return true;
        }
        else
            return false;
    }
    public static void printResult(boolean isWinterreifenPflicht){
        if(isWinterreifenPflicht== true){
            System.out.println("Bitte verwenden Sie Winterreifen");
        }
        else
            System.out.println("Winterreifen sind nicht notwendig");
    }



    public static boolean itsWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        boolean itsWinterreifenPflicht = true;
        if (temperatur < 10 & rutschigeFahrbahn == true) {
            itsWinterreifenPflicht = true;
        } else if (temperatur < 4 & rutschigeFahrbahn == true) {
            itsWinterreifenPflicht = true;
        } else if (temperatur < 4 & rutschigeFahrbahn == false) {
            itsWinterreifenPflicht = true;
        } else
            itsWinterreifenPflicht = false;

        return itsWinterreifenPflicht;
    }
    public static void printsResult(boolean isWinterreifenPflicht){
        boolean itsWinterreifenPflicht = true;
        if(itsWinterreifenPflicht = true){
            System.out.println("Bitte verwenden Sie Winterreifen");
        }
        else if(itsWinterreifenPflicht = false)
            System.out.println("Winterreifen sind nicht notwendig");
    }
}
