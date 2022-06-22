public class PKW extends Fahrzeug {
    
    private int anSitze;

    public PKW(String hersteller,String marke, String farbe, int anSitze){
        super(hersteller, marke, farbe);
        this.anSitze = anSitze;
    }

    @Override
    public void fahren(){
        System.out.println("PKW macht brum brum");
    }

    @Override
    public String toString() {
        return "PKW [hersteller=" + hersteller + ", marke=" + marke + ", farbe=" + farbe + ", anSitze=" + anSitze + "]";
    }
}
