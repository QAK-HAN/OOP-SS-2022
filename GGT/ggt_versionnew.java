import java.util.*;

public class ggt_versionnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ag = true;
        while (ag) {
            System.out.println("gib zahl!");
            int z1 = sc.nextInt();
            System.out.println("gib noch eine zahl!");
            int z2 = sc.nextInt();
            if (z2 < z1) {
                int newCount = countGgt(z1, z2);
                System.out.println(kalkusGgt(z1, z2, newCount));

            } else {
                int newCount = countGgt(z2, z1);
                System.out.println(kalkusGgt(z2, z1, newCount));
            }

            System.out.println("willst du nochmal schmock?");
            if (sc.next().equals("nein")) {
                ag = false;
            }
        }

    }

    public static int countGgt(int a, int b) {
        int c = 1;
        int counter = 0;
        while (c != 0) {
            c = a % b;
            a = b;
            b = c;
            counter++;
        }
        return counter - 1;
    }

    public static int kalkusGgt(int a, int b, int counter) {
        int c = 0;
        while (counter > 0) {

            c = a % b;
            a = b;
            b = c;
            counter--;

        }
        return c;
    }

}
