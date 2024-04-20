public class Jahr {
    private int jahr = 0;
    private Tag[] tage = new Tag[365];
    private int belegt = 0;

    public Jahr(int pJahr) {
        jahr = pJahr;
        for(int i = 0; i < 365; i++) {
            tage[i] = new Tag();
        }
    }

    public void eintragen(int tag, String was, int prioritaet) {
        belegt += tage[tag-1].eintragen(was, prioritaet);
    }

    public String getTermin(int tag) {
        return tage[tag-1].getVerabredung();
    }

    public int getPrioritaet(int tag) {
        return tage[tag-1].getPrioritaet();
    }

    public int getBelegt() {
        return belegt;
    }

    public int getJahr() {
        return jahr;
    }
}
