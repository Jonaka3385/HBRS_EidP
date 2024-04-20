public class WebShopTest {
    public static void main(String[] args) {
        // erzeuge Webshop
        WebShop w = new WebShop();

        // neuer Kunde
        Kunde kunde1 = w.neuerKunde("Helga", "Herrlich");
        // neuer guter Kunde mit 5% Preisnachlass
        Kunde kunde2 = w.neuerKunde("Werner", "Winzig", 0.05);

        // neuer Artikel (2x Leberwurst, 1x Nutella)
        w.neuerArtikel("Leberwurst", 1.95, 2);
        w.neuerArtikel("Nutella", 3.95, 1);

        // Kunde 1 bestellt eine Leberwurst und ein Nutella
        String[] bestellung1 = {"Leberwurst", "Nutella"};
        String rechnung1 = w.bestellen(kunde1, bestellung1);
        // Rechnung Kunde 1 ausgeben
        System.out.println(rechnung1);

        // Kunde 2 bestellt eine Leberwurst, ein Nutella und eine Butter
        String[] bestellung2 = {"Leberwurst", "Nutella", "Butter"};
        String rechnung2 = w.bestellen(kunde2, bestellung2);
        // Rechnung Kunde 1 ausgeben
        System.out.println(rechnung2);
    }
}
