public class Zahlendarstellung {

    public static int[] ermittleZiffern(int x, int b) {
        double y = x;
        int n = 0;

        do {
            y /= b;
            n++;
        }	while(y<=1 == false);

        int[] a = new int[n];

        y = x;
        for(int i = 0; i < n; i++) {
            double f = y % b;
            a[i] = (int)f;
            y /= b;
        }

        return a;
    }
}
