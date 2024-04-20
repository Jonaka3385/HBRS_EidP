public class Tag {
    private String wat;
    private int prio;

    public Tag() {
        wat = null;
        prio = 0;
    }

    public int eintragen(String was, int prioritaet) {
        if(wat == null) {
            wat = was;
            prio = prioritaet;
            return 1;
        }	else {
            System.out.println("Fehler: " + wat);
            return 0;
        }
    }

    public String getVerabredung() {
        return wat;
    }

    public int getPrioritaet() {
        return prio;
    }
}
