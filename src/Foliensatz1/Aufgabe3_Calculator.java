package Foliensatz1;

public class Aufgabe3_Calculator {
    public static void main(String[] args) {
        int a = 4;
        double b = 5;

        results(sum(4, 5), subtraction(4, 5), multiplication(4, 5), division(4, 5));

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
        System.out.println("Das ist die Summe " + division);
        return division;
    }
    public static void results(double sum, double subtraction, double multiplication, double division){
        System.out.println("Das sind die Ergebnisse: " + sum + ", " + subtraction + ", " + multiplication +
                ", " + division);
    }
}
