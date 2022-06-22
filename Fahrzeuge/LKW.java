public class LKW extends Fahrzeug{

private int nutzlast;

public LKW(String hersteller, String marke, String farbe, int nutzlast) {
    super (hersteller, marke, farbe);
    this.nutzlast = nutzlast;

}

@Override
public void fahren() {
System.out.println("LKW macht brum brum");

}

@Override
public String toString() {

    return "LKW [hersteller=" + hersteller + ", marke=" + marke + ", farbe=" + farbe + ", nutzlast=" + nutzlast + "]";
}


}
