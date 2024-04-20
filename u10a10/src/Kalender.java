public class Kalender {
    public static void main(String[] args) {
        Jahr j2021 = new Jahr(2021);
        Jahr j2022 = new Jahr(2022);

        j2021.eintragen(45, "Klausur", 1);
        j2022.eintragen(37, "Treffen", 5);

        if(j2021.getTermin(17) == null) {
            System.out.println("17. Tag ist belegt");
        }	else {
            System.out.println("17. Tag ist frei");
        }

        if(j2021.getTermin(45) == null) {
            System.out.println("45. Tag ist belegt");
        }	else {
            System.out.println("45. Tag ist frei");
        }

        int belegtGesamt = 0;
        belegtGesamt += j2021.getBelegt();
        belegtGesamt += j2022.getBelegt();

        System.out.println("Belegte Tage insgesamt: " + belegtGesamt);
    }
}
