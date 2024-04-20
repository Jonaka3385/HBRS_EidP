public class Parasitenzahl {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);

        for (int j = 1; j<=i; j++) {
            if(istPZ(j) == true) {
                System.out.println(j);
            }
        }
    }

    private static boolean istPZ(long o) {
        long e, f, tmp1, tmp2;

        String s = Long.toString(o);
        e = o % 10;
        f = e*o;
        tmp1 = o;
        tmp2 = f;

        int t1 = Long.toString(o).length();
        int t2 = Long.toString(f).length();
        if (t1 == t2) {
            tmp1 /= 10;
            for (long c=0; c < (s.length() - 1); c++) {
                long x = tmp1%10;
                long y = tmp2%10;
                if (x != y) {
                    return false;
                }

                tmp1 /= 10;
                tmp2 /= 10;
            }

            if (e == tmp2%10) {
                return true;
            }
        }

        return false;
    }
}
