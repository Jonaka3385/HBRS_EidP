public class Stadion {
    private static Mannschaft mR, mB;
    private static Person[] zuschauer;

    public static void main(String[] args) {
        zuschauer = new Person[45000];
        createZ();
        createMR();
        createMB();

        System.out.println(mR.toString());
        System.out.println(mB.toString());
        System.out.println(mR.einkommen());
        System.out.println(mB.einkommen());
        System.out.println(zuschauer[0].getName());
    }

    private static void createZ() {
        for(int i = 0; i<45000; i++) {
            int j = i+1;
            zuschauer[i] = new Person("Zuschauer-" + j);
        }
    }

    private static void createMR() {
        Fussballspieler[] fs = new Fussballspieler[5];
        for(int i = 0; i<5; i++) {
            int j = i+1;
            fs[i] = new Fussballspieler("Spieler-rot-" + j, 10000*j);
        }
        mR = new Mannschaft(fs[0], fs[1], fs[2], fs[3], fs[4]);
    }

    private static void createMB() {
        Fussballspieler[] fs = new Fussballspieler[5];
        for(int i = 0; i<5; i++) {
            int j = i+1;
            fs[i] = new Fussballspieler("Spieler-blau-" + j, 20000*j);
        }
        mB = new Mannschaft(fs[0], fs[1], fs[2], fs[3], fs[4]);
    }
}
