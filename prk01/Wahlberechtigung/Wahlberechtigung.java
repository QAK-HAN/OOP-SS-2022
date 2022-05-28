import java.util.*;
class Wahlberechtigung
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Bitte Alter eingeben: ");
int alter = sc.nextInt();
if (alter >= 18){
System.out.println("Sie sind wahlberechtigt.");
} else {
System.out.println("Du bist noch nicht wahlberechtigt.");
}
}
}

