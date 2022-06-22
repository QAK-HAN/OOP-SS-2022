import java.util.*;

public class ggt {
    public static void main(String[] banana) {
        Scanner sc = new Scanner(System.in);
        boolean ag = true;
        while (ag) {
            System.out.println("gib zahl!");
            int z1 = sc.nextInt();
            System.out.println("gib noch eine zahl!");
            int z2 = sc.nextInt();
            if (z2 < z1) {
                int tempreturn = kalkusGgt(z1, z2);
                System.out.printf("dein ggt ist %s.", tempreturn);

            } else {
                int tempreturn = kalkusGgt(z2, z1);
                System.out.printf("dein ggt ist %s", tempreturn);
            }
            System.out.println("willst du nochmal schmock? y/n");
            if (sc.next().equals("n")) {
                ag = false;
            }
        }

    }

    public static int kalkusGgt(int a, int b) {
        int c = 1;
        int temp = 0;

        while (c != 0) {
            temp = c;
            c = a % b;
            a = b;
            b = c;
            temp = c;
            System.out.println(c);
        }

        return temp;
    }

}