import java.util.Scanner;

public class Caesar {

    private static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        int k = sc.nextInt();
        String s = sc.next();

        String a = "";
        a += (char) ((s.charAt(0) - 65 + k) % 26 + 65);
        System.out.println(a);
    }
}
