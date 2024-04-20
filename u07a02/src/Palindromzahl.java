public class Palindromzahl {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int tmp = spiegelAddieren(i);

        while(!palindromTest(tmp)) {
            tmp += spiegelAddieren(tmp);
        }

        System.out.println(spiegeln(i));
        System.out.println(spiegelAddieren(i));
        System.out.println(tmp);
    }

    public static int spiegeln(int zahl) {
        int z = 0;
        int e = zahl;
        int f = 1;
        int u = 0;

        while (e!=0) {
            e /= 10;
            z++;
        }

        for (int a = 1; a < z; a++) {
            f *= 10;
        }

        e = zahl;
        while (e!=0) {
            u += (e  % 10) * f;
            e /= 10;
            f /= 10;
        }

        return u;
    }

    public static int spiegelAddieren(int zahl) {
        return zahl + spiegeln(zahl);
    }

    public static boolean palindromTest(int zahl) {
        if (zahl == spiegeln(zahl)) {
            return true;
        }
        else {
            return false;
        }
    }
}
