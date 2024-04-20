public class MessReihe {
    private MessDatum[] reihe;
    private int current = 0;
    private int n;
    private MessBereich uM, tM, dM;

    public MessReihe(int n) {
        reihe = new MessDatum[n];
        this.n = n;
        uM = new MessBereich(0, 12000, 8000);
        tM = new MessBereich(0, 200, 150);
        dM = new MessBereich(0, 6, 5);
    }

    public void neueMessung(int u, double t, double d) throws TooMuchData, IllegalValue, CriticalValue {
        try {
            uM.pruefen(u);
        }
        catch(IllegalValue iv) {
            throw iv;
        }
        catch(CriticalValue cv) {
            throw cv;
        }

        try {
            tM.pruefen(t);
        }
        catch(IllegalValue iv) {
            throw iv;
        }
        catch(CriticalValue cv) {
            throw cv;
        }

        try {
            dM.pruefen(d);
        }
        catch(IllegalValue iv) {
            throw iv;
        }
        catch(CriticalValue cv) {
            throw cv;
        }

        if(nMD(u, t, d)) {
            reihe[current] = new MessDatum(u, t, d);
            current++;
        }	else {
            throw new TooMuchData("Fehler: TooMuchData");
        }
    }

    private boolean nMD(int u, double t, double d) {
        if(current>=n) {
            return false;
        }
        return true;
    }

    public double[] ermittleMittelwerte() {
        double[] tmp = new double[3];
        double tmpU = 0;
        double tmpT = 0;
        double tmpD = 0;

        for(int i = 0; i < current; i++) {
            tmpU += reihe[i].getU();
            tmpT += reihe[i].getT();
            tmpD += reihe[i].getD();
        }
        tmpU /= current;
        tmpT /= current;
        tmpD /= current;
        tmp[0] = tmpU;
        tmp[1] = tmpT;
        tmp[2] = tmpD;

        return tmp;
    }
}
