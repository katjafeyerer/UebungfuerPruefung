package Foliensatz2;

public class Zusatzaufgabe_ArrayDemo2 {
    public static void main(String[] args) {
        String[] array = new String[13];
        array[1] = "Jaenner";
        array[2] = "Februar";
        array[3] = "Maerz";
        array[4] = "April";
        array[5] = "Mai";
        array[6] = "Juni";
        array[7] = "Juli";
        array[8] = "August";
        array[9] = "September";
        array[10] = "Oktober";
        array[11] = "November";
        array[12] = "Dezember";

        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i] + "[" + i + "]");

        }
    }
}
