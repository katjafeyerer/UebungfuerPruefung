package Foliensatz3;

public class PersonDemo {
    public static void main(String[] args) {
        Person franz = new Person();
        franz.firstname = "Franz";
        franz.lastname = "Feyerer";
        franz.age = 49;

        Person waltraud = new Person();
        waltraud.firstname = "Waltraud";
        waltraud.lastname = "Feyerer";
        waltraud.age = 62;

        System.out.println(franz.firstname + " " + franz.lastname + ", " + franz.age);
    }
}
