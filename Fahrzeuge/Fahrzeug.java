public abstract class Fahrzeug {

    protected String hersteller;
    protected String marke;
    protected String farbe;

    public Fahrzeug(String hersteller, String marke, String farbe) {
        this.hersteller = hersteller;
        this.farbe = farbe;
        this.marke = marke;
    }

    public abstract void fahren();

@Override
public String toString() {
    
    return "Fahrzeug [hersteller=" + hersteller + ", marke=" + marke + ", farbe=" + farbe;
}


    
}
