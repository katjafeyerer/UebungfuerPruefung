package Foliensatz2;

public class Aufgabe4_Division {

     public static void main(String[] args) {
            int a = 4;
            double b = 5;

            results(sum(4, 5), subtraction(4, 5), multiplication(4, 5), division(4, 5));
            results(sum(4, 0), subtraction(4, 0), multiplication(4, 0), division(4, 0));
        }

        public static double sum(int a, double b){
            double sum = a +b;
            System.out.println("Das ist die Summe " + sum);
            return sum;
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
         if(b !=0){
             return division;
         }else{
             System.out.println("Eine Division durch 0 ist nicht möglich.");
         }
            return 0;
        }
        public static void results(double sum, double subtraction, double multiplication, double division){
            System.out.println("Das sind die Ergebnisse: " + sum + ", " + subtraction + ", " + multiplication +
                    ", " + division);
        }
    }

