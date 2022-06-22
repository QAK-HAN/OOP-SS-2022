import java.util.*;

class Wahl {
    public static void main(String[] args) {
        Scanner Vorname = new Scanner(System.in);
        System.out.print("Wie lautet ihr vorname?");
        String VName = Vorname.next();
        System.out.println(VName);
        Scanner Nachname = new Scanner(System.in);
        System.out.print("Wie lautet ihr Naname?");
        String NName = Nachname.next();
        System.out.println("NName");

        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Alter eingeben: ");
        int alter = sc.nextInt();
        if (alter >= 18) {
            System.out.println("Sie sind wahlberechtigt.");
        } else {
            System.out.println("Du bist noch nicht wahlberechtigt.");
        }
    }
}
