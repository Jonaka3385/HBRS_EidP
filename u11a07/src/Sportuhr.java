public class Sportuhr extends Uhr {
    private int herzfrequenz = 0;
    private int akt = 0;

    public Sportuhr() {
        super();
    }

    public void setHerzfrequenz(int wert) {
        herzfrequenz = wert;
    }

    public void wechselAnzeige() {
        akt++;
    }

    public String toString() {
        String s = "";

        if(akt%2 == 0) {
            s += "Uhrzeit: " + super.toString();
        }
        if(akt%2 == 1) {
            s += "Herzfrequenz: " + herzfrequenz;
        }

        return s;
    }
}
