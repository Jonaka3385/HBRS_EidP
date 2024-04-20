public class ReelleZahl extends Zahl {
    private double zahl;

    public ReelleZahl(double r) {
        zahl = r;
    }

    @Override
    public Zahl addieren(Zahl z) {
        double tmp = zahl;

        double a = Double.parseDouble(z.toString());
        tmp += a;

        return new ReelleZahl(tmp);
    }

    @Override
    public Zahl subtrahieren(Zahl z) {
        double tmp = zahl;

        double a = Double.parseDouble(z.toString());
        tmp -= a;

        return new ReelleZahl(tmp);
    }

    @Override
    public Zahl multiplizieren(Zahl z) {
        double tmp = zahl;

        double a = Double.parseDouble(z.toString());
        tmp *= a;

        return new ReelleZahl(tmp);
    }

    @Override
    public Zahl dividieren(Zahl z) {
        double tmp = zahl;

        double a = Double.parseDouble(z.toString());
        tmp /= a;

        return new ReelleZahl(tmp);
    }

    @Override
    public String toString() {
        return "" + zahl;
    }

}
