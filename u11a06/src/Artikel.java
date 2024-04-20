public class Artikel {
    private String name;
    private double preis;
    private int anzahl;

    public Artikel(String name, double preis, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public void setPreis(double pPreis) {
        preis = pPreis;
    }

    public double getPreis() {
        return preis;
    }

    public void setAnzahl(int pAnzahl) {
        anzahl = pAnzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }


}
