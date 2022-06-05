import java.io.*;
import java.util.Scanner;

public class Notenauswertung {

    public static void main(String[] args) throws FileNotFoundException {
        int zähler;
        zähler = zählen();
        int[][] hauptArray = new int[zähler][2];
        hauptArray = csvAuslesung(hauptArray);

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

    public static void notenspiegel (){
        int [] noten = new 

        
    }

}