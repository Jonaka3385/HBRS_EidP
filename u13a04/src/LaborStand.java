import java.io.*;
import java.util.*;

public class LaborStand {
    public static void main(String[] args) throws FileNotFoundException {
        int maxAnzahlDatensaetze = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(new File(args[1]));
        MessReihe messReihe = new MessReihe(maxAnzahlDatensaetze);

        while(sc.hasNext()) {
            int u = sc.nextInt();
            double t = sc.nextDouble();
            double d = sc.nextDouble();
            try {
                messReihe.neueMessung(u, t, d);
            }
            catch(IllegalValue iv) {
                System.out.println(iv.getMessage());
            }
            catch(TooMuchData tmd) {
                System.out.println(tmd.getMessage());
            }
            catch(CriticalValue cv) {
                System.out.println(cv.getMessage());
                System.exit(1);
            }
        }
        sc.close();

        double[] mittelwerte = messReihe.ermittleMittelwerte();
        System.out.println("Durchschnitt von Umdrehungszahl: " + mittelwerte[0]);
        System.out.println("Durchschnitt von Temperatur: " + mittelwerte[1]);
        System.out.println("Durchschnitt von Ladedruck: " + mittelwerte[2]);
    }
}
