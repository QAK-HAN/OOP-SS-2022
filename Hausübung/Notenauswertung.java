import java.io.*;
import java.util.Scanner;

public class Notenauswertung {

    public static void main(String[] args) throws FileNotFoundException {
        int zähler = zählen();
        int[][] hauptArray = new int[zähler][2];
        hauptArray = csvAuslesung(hauptArray);
        notenspiegelRechner(hauptArray);

    }

    public static int zählen() throws FileNotFoundException {

        File getCSVFiles = new File("Notenliste.csv");
        Scanner sc = new Scanner(getCSVFiles);

        int h = 0;
        while (sc.hasNext()) {
            sc.nextLine();

            h++;
        }
        sc.close();
        return h;

    }

    public static int[][] csvAuslesung(int doppelFuge[][]) throws FileNotFoundException {

        File getCSVFiles = new File("Notenliste.csv");
        Scanner sc = new Scanner(getCSVFiles);

        int h = 0;
        while (sc.hasNext()) {

            String wischmopp = sc.nextLine();
            String[] mrPropper = wischmopp.split(",");

            int fugeEins = Integer.parseInt(mrPropper[0]);
            int fugeZwei = Integer.parseInt(mrPropper[1]);

            doppelFuge[h][0] = fugeEins;
            doppelFuge[h][1] = fugeZwei;

            h++;

        }
        sc.close();
        return doppelFuge;
    }

    public static void notenspiegelRechner(int[][] noten) {
        int[] notenspiegel = new int[5];
        for (int i = 0; i < notenspiegel.length; i++) {
            notenspiegel[i] = 0;
        }

        int punkte = 88;


        if (punkte > 87) {
            notenspiegel[0] = 1;

        } else if (punkte > 72) {
            notenspiegel[1] = 2;
        }

        else if (punkte > 57) {
            notenspiegel[2] = 3;
        }
        else if (punkte > 49) {
            notenspiegel[3] = 4;
        }
        else if (punkte > 0) {
            notenspiegel[4] = 5;
        }

        System.out.println(notenspiegel);

    }

}
