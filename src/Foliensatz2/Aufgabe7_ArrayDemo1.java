package Foliensatz2;

public class Aufgabe7_ArrayDemo1 {
    public static void main(String[] args) {

        int[] Array1 = new int[3];
        int ArrayA = Array1[0];

        //initialisieren des Array
        Array1[0] = 3;
        Array1[1] = 4;
        Array1[2] = 5;

        int[] Array2 = {2, 3, 4};

        int sum0 = Array1[0] + Array2[0];
        int sum1 = Array1[1] + Array2[1];
        int sum2 = Array1[2] + Array2[2];
        System.out.println("Das ist die elementare Addition der Elemente" + ": " + sum0 +
                ", " + sum1 + ", " + sum2);

        int multi0 = Array1[0] * Array2[0];
        int multi1 = Array1[1] * Array2[1];
        int multi2 = Array1[2] * Array2[2];
        System.out.println("Das ist die elementare Addition der Elemente" + ": " + multi0 +
                ", " + multi1 + ", " + multi2);

        System.out.println("Das ist die Länge des Arrays2: " + Array2.length);

        for (int i = 0; i < Array2.length; i++) {
            System.out.println(Array2[i]);

        }

    }
}
