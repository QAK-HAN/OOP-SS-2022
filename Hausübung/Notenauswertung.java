import java.io.*;
import java.util.Scanner;

public class Notenauswertung {

    public static void main(String[] args) throws FileNotFoundException {
        int[][] hauptArray = new int[100][2];
        keinPlan(hauptArray);

        }

    

    public static void keinPlan(int doppelFuge [][] ) throws FileNotFoundException {
        
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
    } 
    public static void lel (int[][] lul){
        System.out.println(lul[0][0]);
    }





    }