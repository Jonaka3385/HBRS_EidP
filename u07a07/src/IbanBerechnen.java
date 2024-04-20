import java.util.*;

public class IbanBerechnen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        System.out.println(iban(s1, s2, s3));
        sc.close();
    }

    private static String iban(String s1, String s2, String s3) {
        String lc = laendercode(s1);
        String iban = "";

        String kn = kontonummer(s3);

        iban = lcbban(s2, kn, lc);

        return iban;
    }

    private static String laendercode(String s) {
        char a1 = s.charAt(0);
        char a2 = s.charAt(1);
        if (Character.isLowerCase(a1)) {
            a1 = (char) (a1 & 0x5f);
        }
        if (Character.isLowerCase(a2)) {
            a2 = (char) (a2 & 0x5f);
        }

        String lc = "" + a1 + a2;
        return lc;
    }

    private static String kontonummer(String s) {
        while(s.length() < 10) {
            String tmp = s;
            s = "0" + tmp;
        }

        return s;
    }

    private static String lcbban(String s1, String s2, String s3) {
        String lcbban = "";
        String tmpbban = s1 + s2;

        int t1 = umwandler(s3.charAt(0)) + 9;
        int t2 = umwandler(s3.charAt(1)) + 9;
        String tlc = "" + t1 + t2 + "00";

        String tmpbban2 = tmpbban + tlc;

        while (tmpbban2.length() > 2) {
            String tmps = "";
            int tmpi = 0;
            int n = 9;

            if(tmpbban2.length()<=9) {
                n = tmpbban2.length();
            }
            else {
                n = 9;
            }

            for (int i = 0; i < n; i++) {
                tmps += tmpbban2.charAt(i);
            }

            tmpi = Integer.parseInt(tmps);

            int tmpz = tmpi % 97;

            String tmpb = "";

            if (tmpbban2.length()>9) {
                for (int i = 9; i < tmpbban2.length(); i++) {
                    tmpb += tmpbban2.charAt(i);
                }
            }

            tmpbban2 = tmpz + tmpb;
        }

        String pz = "";
        int pzi = 98 - Integer.parseInt(tmpbban2);
        if (pzi<10) {
            pz += "0" + pzi;
        }
        else {
            pz += pzi;
        }

        lcbban += s3 + pz + tmpbban;

        return lcbban;
    }

    private static int umwandler(char a) {
        int b = 0;
        switch(a) {
            case 'A':
                b = 1;
                break;
            case 'B':
                b = 2;
                break;
            case 'C':
                b = 3;
                break;
            case 'D':
                b = 4;
                break;
            case 'E':
                b = 5;
                break;
            case 'F':
                b = 6;
                break;
            case 'G':
                b = 7;
                break;
            case 'H':
                b = 8;
                break;
            case 'I':
                b = 9;
                break;
            case 'J':
                b = 10;
                break;
            case 'K':
                b = 11;
                break;
            case 'L':
                b = 12;
                break;
            case 'M':
                b = 13;
                break;
            case 'N':
                b = 14;
                break;
            case 'O':
                b = 15;
                break;
            case 'P':
                b = 16;
                break;
            case 'Q':
                b = 17;
                break;
            case 'R':
                b = 18;
                break;
            case 'S':
                b = 19;
                break;
            case 'T':
                b = 20;
                break;
            case 'U':
                b = 21;
                break;
            case 'V':
                b = 22;
                break;
            case 'W':
                b = 23;
                break;
            case 'X':
                b = 24;
                break;
            case 'Y':
                b = 25;
                break;
            case 'Z':
                b = 26;
                break;
            default:
                break;
        }

        return b;
    }
}
