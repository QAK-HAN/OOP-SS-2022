import java.util.Random;

public class Lottozahlen {
    static int[] zahlen = new int[100];
    static int[] doppelteZahlen = new int[50];

    public static void main(String[] args) {
        // initialisiere mit Zufallszahlen zwischen 1 und 49
        initArray();
        // Ausgabe eines Arrays: Index und Wert
        ausgabeArray(zahlen);
        // Ausgabe von Maximal-, Minimal- und Durchschnitwert
        System.out.println("Maximalwert: " + maxWert());
        System.out.println("Minimalwert: " + minWert());
        System.out.println("Mittelwert: " + midWert());
        // Suche nach doppelten Zahlen
        sucheDoppelte();
        // Ausgabe wie oft die Zahlen zwischen 1 und 49 bei den 100
        // Zufallszahlen vorkommt
        System.out.println("Auswertung");
        ausgabeArray(doppelteZahlen);
        // Suche nach dem erstmaligen Vorkommen einer doppelten Zahl
        // Ausgabe der Position
        System.out.println("Erste doppelte Zahl bei: "
                + indexErsteDoppelte(zahlen));
    }

    private static int indexErsteDoppelte(int[] zahlen2) {
        int lul = 0;
        int quit = 100;
        for (int e = 0; e <= quit; e++) {
            for (int i = 0; i < zahlen2.length; i++) {
                for (int j = 0; j < doppelteZahlen.length; j++) {
                    if (zahlen2[i] == j) {
                        lul = doppelteZahlen[j - 1] = +1;
                        quit = 0;

                    }
                }

            }
        }
        return lul;
    }

    private static void sucheDoppelte() {
        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < doppelteZahlen.length; j++) {
                if (zahlen[i] == j) {
                    doppelteZahlen[j - 1] = +1;
                }
            }

        }
    }

    private static double midWert() {
        int midWert1 = 0;
        for (int i = 0; i < zahlen.length; i++) {
            midWert1 += zahlen[i];

        }
        double midWert2 = midWert1 / zahlen.length;
        return midWert2;
    }

    private static int maxWert() {
        int maxWert1 = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (maxWert1 <= zahlen[i]) {
                maxWert1 = zahlen[i];
            }
        }
        return maxWert1;
    }

    private static int minWert() {
        int minWert1 = 0;
        for (int i = 0; i > zahlen.length; i++) {
            if (minWert1 >= zahlen[i]) {
                minWert1 = zahlen[i];
            }
        }
        return minWert1;
    }

    private static void ausgabeArray(int[] neueZahlen) {
        for (int i = 0; i < neueZahlen.length; i++) {
            System.out.println("Am Index: " + i + 1 + " ist die Zahl: " + neueZahlen[i]);
        }

    }

    private static void initArray() {
        Random rand = new Random();
        for (int i = 0; i < zahlen.length; i++) {
            int number = rand.nextInt(1, 49);
            zahlen[i] = number;
        }

    }

}