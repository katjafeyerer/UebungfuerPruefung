/*package Uebungsblatt7;

public class IbanValidierung {
    private String iban;
    private int calculatedCheckSum;

    public IbanValidierung(String iban) {
        this.iban = iban;
        this.calculatedCheckSum = -1;
    }
    public String getCountryCode(String iban){
        String substring;
        substring = iban.substring(0,2); //0-2 --> die ersten zwei werden genommen
        return substring;
    }
    public int getCheckSum(String iban){
        String substring;
        substring = iban.substring(2, 4);
        int value = Integer.valueOf(substring);
        return value;
    }
    public String getAccountNumber(String iban){
        String substring;
        substring = iban.substring(4, 20);
        return substring;
    }

    @Override
    public String toString() {
        return "IbanValidierung{" +
                "iban='" + iban + '\'' +
                ", calculatedCheckSum=" + calculatedCheckSum +
                '}';
    }

    public String getIban() {
        return iban;
    }

    public String getCountryCodeNumer(){
        return null;
    }
    public String getCountryCodeNumber(){
        String countryCodeNumber = iban.substring(0, 2);

        char first = getCountryCode().charAt(0);
        char second = getCountryCode().charAt(1);
        countryCodeNumber = "" + (first - 55) + (second -55) + 0 + 0;
        return countryCodeNumber;
     }

     public String getFullCode(){
        return getAccountNumber() + getCountryCodeNumber();

     }
     public int[] buildArray(){
        int[] arr = new int[getFullCode().length()];

         for (int i = 0; i < getFullCode().length(); i++) {
             arr[i] = Integer.valueOf(getFullCode().substring(i-1,i));

         }
         return arr;
     }
     public int calcCheckSum(){
        int temp = 0; //Hilfsvariable = 0
        int[] tempArray = buildArray();

         for (int i = 0; i < buildArray().length; i++) {
            temp = ((10*temp)+ buildArray()[i]) % 97; //1 ist erste Zahl im Array

         }
         int calculatedChecksum;
         calculatedChecksum = (98- temp) % 97;
         return calculatedChecksum;

     }
     public boolean isIbanCorrect(){
        if(calcCheckSum() == getCheckSum(getIban()));
        { return true;
         } else {
            return false;
         }
     }
}*/
