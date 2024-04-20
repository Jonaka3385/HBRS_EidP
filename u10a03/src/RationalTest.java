import java.util.*;

public class RationalTest {
    private static Scanner sc = new Scanner(System.in);
    private static Rational r;

    public static void main(String[] args) {
        int z = sc.nextInt();
        int n = sc.nextInt();
        r = new Rational(z, n);

        String s = "";
        char o = '.';
        int tz, tn;
        Rational tr;
        s = sc.next();
        o = s.charAt(0);

        do {
            tz = sc.nextInt();
            tn = sc.nextInt();
            tr = new Rational(tz, tn);

            if (o == '+') {
                r = r.add(tr);
            }	else if(o == '-') {
                r = r.sub(tr);
            }	else if(o == '*') {
                r = r.mul(tr);
            }	else if(o == '/') {
                r = r.div(tr);
            }	else {
                ;
            }

            s = sc.next();
            o = s.charAt(0);
        }	while(o != '.');

        System.out.println(r.toString());
    }
}
