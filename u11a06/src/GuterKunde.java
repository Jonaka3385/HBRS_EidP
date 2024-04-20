public class GuterKunde extends Kunde {
    private double nachlass;

    public GuterKunde(String vorname, String nachname, double nachlass) {
        super(vorname, nachname);
        this.nachlass = nachlass;
    }

    public void setNachlass(double pNachlass) {
        nachlass = pNachlass;
    }

    public double getNachlass() {
        return nachlass;
    }


}
