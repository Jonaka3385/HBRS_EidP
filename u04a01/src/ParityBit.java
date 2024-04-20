public class ParityBit {

    public static void main(String[] args) {
        int wert = 0x17;
        int bit1 = umwandler(wert);
        int bit2 = umwandler(wert >> 1);
        int bit3 = umwandler(wert >> 2);
        int bit4 = umwandler(wert >> 3);
        int bit0 = umwandler(wert >> 4);

        int sum = bit1+bit2+bit3+bit4;
        boolean tf = bit0 == sum%2;

        System.out.println(tf);
        System.out.println(sum);
        System.out.println(bit0);
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
