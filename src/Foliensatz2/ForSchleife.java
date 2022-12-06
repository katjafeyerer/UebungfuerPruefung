package Foliensatz2;

public class ForSchleife {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);

        }

        for (int i = 20; i <=90 ; i++) {
            if(i % 5==0){
                System.out.println(i);
            }

        }
    }
}
