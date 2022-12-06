package Uebungsblatt2;

public class UeBl3_TurmDemo {
    public static void main(String[] args) {
        int i = 2;
        int tmp = i;
        int result;

        while(i >= 2 && i <=9){
            result = tmp * i;
            System.out.println(tmp + "*" + i + "=" + result);
            tmp = result;
            i++;

        }
        i = 2;
        while(i <= 9 && i >= 2){
            result = tmp / i;
            System.out.println(tmp + "/" + i + "=" + result);
            tmp = result;
            i++;
        }

    }
}
