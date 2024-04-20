public class Weg {
    private Punkt[] weg = new Punkt[1];


    public Weg(int pX, int pY) {
        Punkt p = new Punkt(pX, pY);
        weg[0] = p;
    }

    public int getAnzahl() {
        return weg.length;
    }

    public void verlaengern(Weg pW) {
        laenger(pW.getAnzahl());
        int x = pW.getAnzahl();
        Punkt[] p = pW.getWeg();

        int y = getAnzahl() - x;
        for (int i = 0; i < x; i++) {
            weg[y] = p[i];
            y++;
        }
    }

    private void laenger(int pX) {
        Punkt[] pAlt = weg;
        Punkt[] pNeu = new Punkt[getAnzahl() + pX];
        for (int i = 0; i < pAlt.length; i++) {
            pNeu[i] = pAlt[i];
        }
        weg = pNeu;
    }

    public String toString() {
        String s = "";

        s += weg[0].toString();
        for (int i = 1; i < getAnzahl(); i++) {
            s += "-";
            s += weg[i].toString();
        }

        return s;
    }

    public Punkt[] getWeg() {
        return weg;
    }
}
