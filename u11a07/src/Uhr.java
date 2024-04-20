public class Uhr {
    protected int stunde;
    protected int minute;
    protected int sekunde;

    public Uhr() {
        stunde = 0;
        minute = 0;
        sekunde = 0;
    }

    public Uhr(int pStunde, int pMinute, int pSekunde) {
        stunde = pStunde;
        minute = pMinute;
        sekunde = pSekunde;
    }

    private void anpassen() {
        if(sekunde >= 60) {
            sekunde -= 60;
            minute++;
        }
        if(minute >= 60) {
            minute -= 60;
            stunde++;
        }
        if(stunde >= 24) {
            stunde -= 24;
        }
    }

    public void tick() {
        sekunde++;
        anpassen();
    }

    public String toString() {
        String s = "";
        s += stunde + ":" + minute + ":" + sekunde;
        return s;
    }


}
