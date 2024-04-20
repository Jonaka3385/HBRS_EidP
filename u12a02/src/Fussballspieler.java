public class Fussballspieler {
    protected String name;
    protected int einkommen;

    protected Fussballspieler(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int pEinkommen) {
        einkommen = pEinkommen;
    }

    public void gehaltBeziehen(int pGehalt) {
        einkommen += pGehalt;
    }

    public String toString() {
        return name + " " + einkommen;
    }
}
