public class TestKlasse2 {
    public static void main(String[] args) {
        System.out.println(gibZahl(4711));
    }
    // in dieser Methode duerfen Sie Ergaenzungen vornehmen
    public static String gibZahl(int wert) {
        ZahlKlasse z = new ZahlKlasse(wert) {
            public String toString() {
                return ("" + (2*this.getZahl()));
            }
        };
        return z.toString();
    }
}
