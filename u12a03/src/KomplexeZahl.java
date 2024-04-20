public class KomplexeZahl extends Zahl {
    private String zahl;
    private double a;
    private double b;

    public KomplexeZahl(double pA, double pB) {
        a = pA;
        b = pB;
        createZahl();
    }

    @Override
    public Zahl addieren(Zahl z) {
        KomplexeZahl tmpZ = (KomplexeZahl) z;

        double tmpA = 0;
        double tmpB = 0;
        double zA = tmpZ.getRealteil();
        double zB = tmpZ.getImaginaerteil();

        tmpA = a + zA;
        tmpB = b + zB;

        createZahl();
        return new KomplexeZahl(tmpA, tmpB);
    }

    @Override
    public Zahl subtrahieren(Zahl z) {
        KomplexeZahl tmpZ = (KomplexeZahl) z;

        double tmpA = 0;
        double tmpB = 0;
        double zA = tmpZ.getRealteil();
        double zB = tmpZ.getImaginaerteil();

        tmpA = a - zA;
        tmpB = b - zB;

        createZahl();
        return new KomplexeZahl(tmpA, tmpB);
    }

    @Override
    public Zahl multiplizieren(Zahl z) {
        KomplexeZahl tmpZ = (KomplexeZahl) z;

        double tmpA = 0;
        double tmpB = 0;
        double zA = tmpZ.getRealteil();
        double zB = tmpZ.getImaginaerteil();

        tmpA = a*zA - b*zB;
        tmpB = a*zB + b*zA;

        createZahl();
        return new KomplexeZahl(tmpA, tmpB);
    }

    @Override
    public Zahl dividieren(Zahl z) {
        KomplexeZahl tmpZ = (KomplexeZahl) z;

        double tmpA = 0;
        double tmpB = 0;
        double zA = tmpZ.getRealteil();
        double zB = tmpZ.getImaginaerteil();

        tmpA = (a*zA + b*zB)/(zA*zA + zB*zB);
        tmpB = (b*zA - a*zB)/(zA*zA + zB*zB);

        createZahl();
        return new KomplexeZahl(tmpA, tmpB);
    }

    @Override
    public String toString() {
        return zahl;
    }

    public double getRealteil() {
        return a;
    }

    public double getImaginaerteil() {
        return b;
    }

    private void createZahl() {
        zahl = a + "+" + b + "*i";
    }
}
