public class Spiegeln {
    public static void main(String[] args) {
        String s = "hallo";
        System.out.println(s + " gespiegelt ist " + Spiegeln.spiegeln(s));;
    }

    public static String spiegeln(String s) {
        String tmp = "";

        for(int i = s.length()-1; i >= 0; i--) {
            tmp += s.charAt(i);
        }

        return tmp;
    }
}
