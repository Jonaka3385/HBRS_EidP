public class Mannschaft {
    private Fussballspieler[] spieler = new Fussballspieler[5];

    public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3,
                      Fussballspieler s4, Fussballspieler s5) {
        spieler[0] = s1;
        spieler[1] = s2;
        spieler[2] = s3;
        spieler[3] = s4;
        spieler[4] = s5;
    }

    public int einkommen() {
        int e = 0;

        for(int i = 0; i<5; i++) {
            e += spieler[i].getEinkommen();
        }

        return e;
    }

    public String toString() {
        return ("1. " + spieler[0].getName() + "\n2. " + spieler[1].getName() +
                "\n3. " + spieler[2].getName() + "\n4. " + spieler[3].getName() +
                "\n5. " + spieler[4].getName() + "\n");
    }
}
