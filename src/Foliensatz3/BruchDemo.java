package Foliensatz3;

public class BruchDemo {
    public static void main(String[] args) {
        Bruch b = new Bruch(4, 8);

        b.toDecimal(4, 8);
        //System.out.println(b.toDecimal(4, 8));

        b.print(4, 8);

        b.multiplicate(b);
        //System.out.println(b.multiplicate(b));

        Bruch b2 = new Bruch(1, 6);
        Bruch b3 = new Bruch(5, 6);
        b3.multiplicate(b2, b3);
        b2.multiplicate(b2);
        b3.multiplicate(b2).multiplicate(b2, b3);

    }
}
