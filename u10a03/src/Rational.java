public class Rational {
    private int zaehler, nenner;

    public Rational(int pZaehler, int pNenner) {
        if(pNenner == 0) {
            System.out.println("Fehler: Nenner ist 0");

        }	else {
            zaehler = pZaehler;
            nenner = pNenner;
            vereinfachen();
        }
    }
    public Rational(int x) {
        zaehler = x;
        nenner = 1;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    private void vereinfachen() {
        pmAnpassung();

        int x = zaehler;
        int y = nenner;
        int r = 0;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        int ggT = x;

        zaehler /= ggT;
        nenner /= ggT;

        pmAnpassung();
    }

    private void pmAnpassung() {
        if(nenner < 0) {
            nenner *= (-1);
            zaehler *= (-1);
        }
    }

    public String toString() {
        String s = zaehler + "/" + nenner;
        return s;
    }

    public Rational add(Rational pR) {
        Rational tmp1 = new Rational(zaehler, nenner);
        Rational tmp2 = pR;
        int z1 = tmp1.getZaehler();
        int n1 = tmp1.getNenner();
        int z2 = tmp2.getZaehler();
        int n2 = tmp2.getNenner();

        int n = n1*n2;
        int z = (z1*n2) + (z2*n1);

        Rational r = new Rational(z, n);
        return r;
    }

    public Rational sub(Rational pR) {
        Rational tmp1 = new Rational(zaehler, nenner);
        Rational tmp2 = pR;
        int z1 = tmp1.getZaehler();
        int n1 = tmp1.getNenner();
        int z2 = tmp2.getZaehler();
        int n2 = tmp2.getNenner();

        int n = n1*n2;
        int z = (z1*n2) - (z2*n1);

        Rational r = new Rational(z, n);
        return r;
    }

    public Rational mul(Rational pR) {
        int rZ, rN;
        rZ = zaehler * pR.getZaehler();
        rN = nenner * pR.getNenner();

        Rational r = new Rational(rZ, rN);
        return r;
    }

    public Rational div(Rational pR) {
        int rZ, rN;
        rZ = zaehler * pR.getNenner();
        rN = nenner * pR.getZaehler();

        Rational r = new Rational(rZ, rN);
        return r;
    }
}
