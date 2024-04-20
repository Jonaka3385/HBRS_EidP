public class Vertauschen {

    public static String[] vertauscheInhalt(String[] pS) {
        int l = pS.length;
        String[] s = new String [l];

        int j = l - 1;
        for(int i = 0; i < l; i++) {
            s[i] = " ";
            s[i] = s[i].replaceAll(" ", pS[j]);
            j--;
        }

        return s;
    }

    public static String[] vertauscheReferenz(String[] pS) {
        int l = pS.length;
        String[] s = new String [l];

        int j = l - 1;
        for(int i = 0; i < l; i++) {
            s[i] = pS[j];
            j--;
        }

        return s;
    }

    private static boolean testInhaltGleich(String[] arg1, String[] arg2) {
        boolean b = false;
        if(arg1.length == arg2.length) {
            for(int i = 0; i < arg1.length; i++) {
                if(arg1[i].equals(arg2[i])) {
                    b = true;
                }
                if(!b) {
                    return b;
                }
            }
            return b;
        }
        return b;
    }

    private static boolean testReferenzGleich(String[] arg1, String[] arg2) {
        boolean b = false;
        if(arg1.length == arg2.length) {
            for(int i = 0; i < arg1.length; i++) {
                if(arg1[i] == arg2[i]) {
                    b = true;
                }
                if(!b) {
                    return b;
                }
            }
            return b;
        }
        return b;
    }
}
