import java.io.*;
import java.util.Scanner;

public class Notenauswertung {

    public static void main(String[] args) throws FileNotFoundException {
        int zähler = zählen();
        int[][] hauptArray = new int[zähler][2];
        hauptArray = csvAuslesung(hauptArray);
        int[] notenKatastrophe = notenspiegelRechner(hauptArray);
        for (int i = 0; i < notenKatastrophe.length;i++){
            System.out.println(notenKatastrophe[i]);
        }

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

        
       for (int i = 0; i < doppelFuge.length; i++){
           if (i == 0)continue;
        String wischmopp = sc.nextLine();
        String[] mrPropper = wischmopp.split(",");

        int fugeEins = Integer.parseInt(mrPropper[0]);
        int fugeZwei = Integer.parseInt(mrPropper[1]);

        doppelFuge[i][0] = fugeEins;
        doppelFuge[i][1] = fugeZwei;

       }
        
 
        sc.close();
        return doppelFuge;
    }

    public static int[] notenspiegelRechner(int[][] noten) {
        int[] notenspiegel = new int[5];
        for (int i = 0; i < noten.length; i++) {

            if (noten[i][1] > 87) {

                notenspiegel[0] += 1;
            } else if (noten[i][1] > 72) {

                notenspiegel[1] += 1;
            } else if (noten[i][1] > 57) {

                notenspiegel[2] += 1;
            } else if (noten[i][1] > 49) {

                notenspiegel[3] += 1;
            } else {
                notenspiegel[4] += 1;
            }

        }
        return notenspiegel;

    }
}
