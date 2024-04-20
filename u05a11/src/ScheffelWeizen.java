public class ScheffelWeizen {
    public static void main(String[] args){
        int s = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        boolean g = false;

        for (int m=0; m<=n; m++) {
            for (int f=0; f<=n; f++) {
                for (int k=0; k<=n; k+=2) {
                    if (m+f+k == n & m*3 + f*2 + k*0.5 ==s) {
                        System.out.println(m + " " + f + " " + k);
                        g = true;
                    }
                }
            }
        }
        if (!g) {
            System.out.println("Keine Möglichkeit gefunden.");
        }
    }
}
