public class MessBereich {
    private double min, max, crit;

    public MessBereich(double min, double max, double crit) {
        this.setMin(min);
        this.setMax(max);
        this.setCrit(crit);
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getKrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public void pruefen(double wert) throws IllegalValue, CriticalValue{
        if(wert < min || wert > max) {
            throw new IllegalValue("Fehler: IllegalValue");
        }
        if(wert <= max && wert >= crit) {
            throw new CriticalValue("Fehler: CriticalValue");
        }
    }
}
