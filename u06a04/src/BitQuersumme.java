public class BitQuersumme {
    public static void main(String[] args) {
        int wert = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i<16; i++) {
            sum += umwandler(wert >> i);
        }

        System.out.println(sum);
    }

    private static int umwandler(int i) {
        if ((i & 1) == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
