package Foliensatz3;

public class GehaltskontoDemo {
    public static void main(String[] args) {

        Gehaltskonto susi = new Gehaltskonto("Susi Sorglos", "AT123445565", "12334545", 200);
        Gehaltskonto franz = new Gehaltskonto("Franz Sorglos", "AT123445565", "12334545", 200);
        Gehaltskonto stefan = new Gehaltskonto("Franz Sorglos", "AT123445565", "12334545", 200);
        Gehaltskonto joerg = new Gehaltskonto("Franz Sorglos", "AT123445565", "12334545", 200);

        susi.aufbuchen(100);
        susi.abbuchen(450);
        susi.aufbuchen(234);
        System.out.println("Der Kontostand von Susi beträgt: " + susi.getKontostand());

        Gehaltskonto[] bank = new Gehaltskonto[4];
        bank[0] = susi;
        bank[1] = franz;
        bank[2] = stefan;
        bank[3] = joerg;
        for (int i = 0; i < bank.length; i++) {
            if(bank[i] == null)
                System.out.println(i + " ist die nächste freie Position");

            System.out.println("bank[i].getKontostand() = " + bank[i].getKontostand());
        }

    }
}
