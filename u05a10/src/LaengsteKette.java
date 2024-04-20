import java.util.*;

public class LaengsteKette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tmp = 0;
        int l = 0;
        int lmax = 0;

        while(sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i == tmp) {
                l++;
            }
            else {
                if (l>lmax) {
                    lmax = l;
                } else {
                    ;
                }
                l = 1;
            }
            tmp = i;
        }
        if (l>lmax) {
            lmax = l;
        }
        System.out.println(lmax);
        sc.close();
    }
}
