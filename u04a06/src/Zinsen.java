public class Zinsen {

    public static void main (String[] args) {
        double k0 = Double.parseDouble(args[0]);
        double p = Double.parseDouble(args[1]);
        double n = Double.parseDouble(args[2]);
        double m = Double.parseDouble(args[3]);

        double i = p/100;

        double kEV = k0 * (1+i*n);
        double kZZ = k0 * Math.pow((1+i), n);
        double kEUV = k0 * Math.pow((1+(i/m)), m*n);

        System.out.println(kEV);
        System.out.println(kZZ);
        System.out.println(kEUV);
    }
}
