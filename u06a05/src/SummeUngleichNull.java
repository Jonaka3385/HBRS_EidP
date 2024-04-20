public class SummeUngleichNull {
    public static void main(String[] args) {
        int n = 3;
        //int n = Integer.parseInt(args[0]);
        double sum = 0;

        for (int o=1; o<=n; o++) {
            for (int u = o-1; u>=o-n; u--) {
                if (u!=0) {
                    sum += o/u;
                }
            }
        }

        System.out.println(sum);
    }
}
