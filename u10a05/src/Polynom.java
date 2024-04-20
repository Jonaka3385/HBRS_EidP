public class Polynom {
    private int m;
    private double[] k;
    private static int anzahl = 0;

    public Polynom(double[] pK) {
        k = pK;
        m = k.length - 1;
        if(k[m] == 0) {
            deleteLast();
        }
    }

    public String toString() {
        String string = "";

        string += (k[m] + "*x^" + m);
        for (int i = m-1; i >= 0; i--) {
            string += (" + " + k[i] + "*x^" + i);
        }
        return string;
    }

    public double auswerten(double x) {
        double s = 0;
        anzahl++;

        for (int i = 0; i <= m; i++) {
            s += k[i] * Math.pow(x, i);
        }

        return s;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    private void deleteLast() {
        m--;
        double[] pNeu = new double[m+1];

        for (int i = 0; i <= m; i++) {
            pNeu[i] = k[i];
        }

        k = pNeu;
    }
}
