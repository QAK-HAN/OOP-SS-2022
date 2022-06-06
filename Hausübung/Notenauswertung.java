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
        System.out.println(bestNote(hauptArray));
        ausgabeHtml();

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

    public static int[][] csvAuslesung(int csvArray[][]) throws FileNotFoundException {

        File getCSVFiles = new File("Notenliste.csv");
        Scanner sc = new Scanner(getCSVFiles);

       
        int h = -1;
        while (sc.hasNext()) {

            String zwischwenVariable = sc.nextLine();
            String[] zwischenArray = zwischwenVariable.split(",");
            if (h == -1){
                h++;
                continue;
            }

            int fugeEins = Integer.parseInt(zwischenArray[0]);
            int fugeZwei = Integer.parseInt(zwischenArray[1]);

            csvArray[h][0] = fugeEins;
            csvArray[h][1] = fugeZwei;

            h++;

        }
        sc.close();
        return csvArray;
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
    public static int bestNote(int [][] bestNoteArray) {
        int bestNote1 = 0;
        for (int i = 0; i < bestNoteArray.length; i++) {
            if (bestNote1 <= bestNoteArray[i][1]) {
                bestNote1 = bestNoteArray[i][1];
            }
        }
        return bestNote1;
    }

    public static void ausgabeHtml (){
        sysout.println("

<!DOCTYPE html>
<html>
<body>

<svg 
height="10000" width="10000">

<rect x="90" y="35" width="200" height="20" rx="3" ry="3" fill="#2A7BB4" 
/>

<rect x="90" y="70" width="200" height="20" rx="3" ry="3" fill="#2A7BB4" 
/>

<rect x="90" y="105" width="200" height="20" rx="3" ry="3" fill="#2A7BB4" 
/>

<rect x="90" y="140" width="200" height="20" rx="3" ry="3" fill="#2A7BB4" 
/>

<rect x="90" y="175" width="200" height="20" rx="3" ry="3" fill="#2A7BB4" 
/>
  
</svg> 
 
</body>
</html>

")
    }
    
}
