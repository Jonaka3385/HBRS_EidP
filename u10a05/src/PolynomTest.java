public class PolynomTest {
    public static void main(String[] args) {
        double[] pD = {2,1,0};
        Polynom p = new Polynom(pD);

        System.out.println(p.toString());
        System.out.println(p.auswerten(2));
        System.out.println(Polynom.getAnzahl());
    }
}
