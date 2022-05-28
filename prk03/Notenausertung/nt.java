import java.util.*;

public class nt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("alle noten");
        int n1 = sc.nextInt();
        System.out.println("nächste");
        int n2 = sc.nextInt();
        System.out.println("nächste");
        int n3 = sc.nextInt();
        System.out.println("nächste");
        int n4 = sc.nextInt();
        System.out.println("nächste");
        int n5 = sc.nextInt();
        System.out.println("alle deine noten: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);
        System.out.println("dein schnitt: " + averageResult(n1, n2, n3, n4, n5));
        System.out.println("dein schnitt: " + bestResult(n1, n2, n3, n4, n5));
    }

    public static int averageResult(int zn1, int zn2, int zn3, int zn4, int zn5) {
        int schnitt = (zn1 + zn2 + zn3 + zn4 + zn5) / 5;
        return schnitt;
    }
    public static int bestResult(int zn1, int zn2, int zn3, int zn4, int zn5){
        int total = 5;
        int sorted = 0;
        int best = 1;

        for (int i = 1; sorted < total; i++)
        int totalSorted = 0;

        

        
        return best;
    }

}