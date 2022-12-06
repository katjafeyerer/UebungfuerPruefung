package Foliensatz2;

public class Aufgabe8_Calculator {

        public static void main(String[] args) {
            int a = 4;
            double b = 5;
            int[] array2 = new int[4];
            array2[0] = 1;
            array2[1] = 2;
            array2[2] = 3;
            array2[3] = 4;

        sum(array2);
        }

        public static void sum(int[] array2){
                double sum = array2[0] + array2[1] + array2[2] + array2[3];
                System.out.println("Das ist die Summe " + sum);
            }

        public static double subtraction(int a, double b){
            double subtraction = a -b;
            System.out.println("Das ist die Summe " + subtraction);
            return subtraction;
        }
        public static double multiplication(int a, double b){
            double multiplication = a*b;
            System.out.println("Das ist die Summe " + multiplication);
            return multiplication;
        }
        public static double division(int a, double b){
            double division = a/b;
            System.out.println("Das ist die Summe " + division);
            return division;
        }
        public static void results(double sum, double subtraction, double multiplication, double division){
            System.out.println("Das sind die Ergebnisse: " + sum + ", " + subtraction + ", " + multiplication +
                    ", " + division);
        }
    }
