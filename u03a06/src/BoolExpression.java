public class BoolExpression {
    private static boolean wert1 = false;
    private static boolean wert2 = true;
    private static boolean temp = true;

    public static void main(String[] args){
        temp = !wert1 & (wert1 | wert2);
        System.out.println(temp);
        wert1 = true;
        temp = !wert1 & (wert1 | wert2);
        System.out.println(temp);
    }
}
