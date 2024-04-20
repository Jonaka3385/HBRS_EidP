public class FlaecheBerechnen {
    public static float flaecheBerechnen(float[][] coord) {
        float e = 0;

        int i = coord.length;
        for (int j = 0; j<i; j++) {
            int n = j+1;
            if (n >= i) {
                n = 0;
            }
            float x1 = coord[j][0];
            float y1 = coord[j][1];
            float x2 = coord[n][0];
            float y2 = coord[n][1];
            e += ((x1 + x2) * (y2 - y1)) / 2;
        }

        return e;
    }
}
