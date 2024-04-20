public class Vektorwinkel {
    public static double winkel(double[] a, double[] b) {
        double s = (skalar(a, b)) / ((Math.sqrt(skalar(a, a)))*(Math.sqrt(skalar(b, b))));
        double o = Math.acos(s);

        double grad = o * 180 / Math.PI;
        return grad;
    }

    private static double skalar(double[] v1,  double[] v2) {
        double sp = 0;

        for (int i = 0; i < v1.length; i++) {
            sp += v1[i] * v2[i];
        }

        return sp;
    }
}
