package Uebungsblatt2;

public class UeBl1_NotenDemo {
    public static void main(String[] args) {

        getNotentext(90);
        System.out.println(getNotentext(100));
        System.out.println(getNotentext(110));

    }
    public static String getNotentext(int punkte) {
        String notenText;

        if (punkte >= 90 && punkte ==100)
            notenText = "Sehr gut";
        else if (punkte <= 89 && punkte >= 78)
            notenText = "Gut";
        else if (punkte <= 77 && punkte >= 65)
            notenText = "Befriedigend";
        else if (punkte <= 64 && punkte >= 51)
            notenText = "Genügend";
        else if(punkte <=50)
            notenText = "Ungenügend";
        else
           notenText = "Bitte geben Sie einen passenden Punktewert an: " + punkte
                   + " ist kein zulässiger Datenwert";
        return notenText;
    }

}
