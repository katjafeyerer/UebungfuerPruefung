package Uebungsblatt4;

public class Zutat {
    private String name; // gibt Zutat an
    private int menge; // gibt Menge wieder in ganzen Zahlen

    public Zutat(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    public String getName() {
        return this.name;
    }

    public int getMenge() {
        return this.menge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Zutat{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }
}
