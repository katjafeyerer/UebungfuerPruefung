package Uebungsblatt3;

public class UeBl1_UmsatzDemo {
    public static void main(String[] args) {

        double[] umsaetze = new double[12];
        umsaetze[0] = 4.5;
        umsaetze[1] = 5.5;
        umsaetze[2] = 2.5;
        umsaetze[3] = 12.5;
        umsaetze[4] = 22.5;
        umsaetze[5] = 26.5;
        umsaetze[6] = 126.5;
        umsaetze[7] = 12.5;
        umsaetze[8] = 22.5;
        umsaetze[9] = 25.5;
        umsaetze[10] = 125.5;
        umsaetze[11] = 12.5;

        int umsatzsteigerungenGT10 = getUmsatzsteigerungGT10(umsaetze);
        System.out.println("UmsatzsteigerungGT10: " + umsatzsteigerungenGT10);
        System.out.println();

        double[][] tagesumsaetzeProWoche = {
                {10, 12, 12, 10, 10},
                {10, 12, 12, 10, 10},
                {10, 12, 12, 10, 10},
                {10, 12, 12, 10, 10},
        };
        double[] umsaetzeProWoche = calculateSumbyWeek(tagesumsaetzeProWoche);
        for (int i = 0; i < umsaetzeProWoche.length; i++) {
            System.out.println("Umsatz in Woche " + (i+1) + " = " + umsaetzeProWoche[i]);
        }
    }
    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int count = 0;
        for (int i = 0; i < umsaetze.length -1 ; i++) {
            double vormonat = umsaetze[i];
            double monat = umsaetze[i+1];

            if(monat > vormonat){
                if((monat - vormonat)/vormonat * 100 >=100){
                    count++;
                }
            }

        }
        return count;
    }
    public static double[] calculateSumbyWeek(double[][] umsaetze){
        double[] wochenUmsaetze = new double[umsaetze.length];
        for (int i = 0; i < umsaetze.length; i++) {
            double[] umsaetzeProWoche = umsaetze[i];
            for (int j = 0; j < umsaetzeProWoche.length; j++) {
                double tagesUmsatz = umsaetzeProWoche[j];
                wochenUmsaetze[i] += tagesUmsatz;
            }
        }

        return wochenUmsaetze;
    }
}
