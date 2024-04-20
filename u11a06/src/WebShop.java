public class WebShop {
    private Kunde[] kunden = new Kunde[10];
    private int kPos = 0;
    private Artikel[] artikels = new Artikel[10];
    private int aPos = 0;
    private GuterKunde[] gK = new GuterKunde[10];
    private int gKPos = 0;

    public WebShop() {
        ;
    }

    public void neuerArtikel(String name, double preis, int anzahl) {
        Artikel tmp = new Artikel(name, preis, anzahl);
        artikels[aPos] = tmp;
        aPos++;
    }

    public Kunde neuerKunde(String vorname, String nachname) {
        Kunde tmp = new Kunde(vorname, nachname);
        kunden[kPos] = tmp;
        kPos++;
        return tmp;
    }

    public Kunde neuerKunde(String vorname, String nachname, double nachlass) {
        GuterKunde tmp = new GuterKunde(vorname, nachname, nachlass);
        kunden[kPos] = tmp;
        kPos++;

        gK[gKPos] = tmp;
        gKPos++;

        return tmp;
    }

    public String bestellen(Kunde kunde, String[] artikel) {
        String k = "";
        double n = 1;
        String zusatz1 = "";
        String zusatz2 = "";

        for(int i = 0; i<kPos; i++) {
            if(kunde.getNachname().equals(kunden[i].getNachname()) && kunde.getVorname().equals(kunden[i].getVorname())) {
                k = kunde.getVorname() + " " + kunde.getNachname();
                break;
            }
        }

        for(int i = 0; i<gKPos; i++) {
            if(kunde.getNachname().equals(gK[i].getNachname()) && kunde.getVorname().equals(gK[i].getVorname())) {
                n -= gK[i].getNachlass();
                zusatz1 += "unseren guten Kunden ";
                zusatz2 += ", Preisnachlass " + (gK[i].getNachlass()*100) + "%";
                break;
            }
        }

        int aPos1 = aPos-1;
        double p = 0;
        int a = 0;
        String arts = "";
        while(a<artikel.length) {
            for(int i = 0; i<=aPos1; i++) {
                if(artikel[a].equals(artikels[i].getName())) {
                    if(artikels[i].getAnzahl()>0) {
                        arts += artikels[i].getName() + " : " + (artikels[i].getPreis()*n) + "\n";
                        p += artikels[i].getPreis()*n;
                        artikels[i].setAnzahl(artikels[i].getAnzahl()-1);
                    }	else {
                        arts += artikels[i].getName() + " : nicht mehr vorhanden\n";
                    }
                    a++;
                    break;
                }
                if(i==aPos1) {
                    arts += artikel[a] + " : nicht gefunden\n";
                    a++;
                }
            }
        }

        String s = "Rechnung fuer " + zusatz1 + k + zusatz2 + ":\n" + arts + "Gesamtpreis : " + p + "\n";
        return s;
    }
}
