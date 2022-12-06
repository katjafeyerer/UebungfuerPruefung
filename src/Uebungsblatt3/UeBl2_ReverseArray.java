package Uebungsblatt3;

public class UeBl2_ReverseArray {
    public static void main(String[] args) {
        String[] value = new String[3];
        value[0] = "Hallo";
        value[1] = "Max";
        value[2] = "Mustermann";

        System.out.println("Input: ");
        for (int i = 0; i < value.length; i++) {
            String output = value[i];
            System.out.println(output + " ");
        }
        reverseArray(value);


    }

    public static String[] reverseArray(String[] arrayToReverse){
        String[] value = new String[3];
        value[0] = "Hallo";
        value[1] = "Max";
        value[2] = "Mustermann";
        System.out.println("Array in general: " + value[0] + " " + value[1] + " " + value[2]);

        for (int i = value.length; i > 0 ; i--) {
        System.out.println("Array to Reverse: " + value[--i] + " " + value[--i] + " " + value[--i]);

        }
        return value;
    }
}
