public class Fahrzeugverwaltung {
    
    public static void main(String[] args) {
        LKW mercedes = new LKW("Daimler", "MB123", "grün", 7000);
        PKW audi = new PKW("VW", "audi", "blau", 240000);
       System.out.println(mercedes);
       mercedes.fahren();
       System.out.println(audi);
       audi.fahren();

       
    }
    
}
