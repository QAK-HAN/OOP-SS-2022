import java.util.*;

public class Faku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("giv faku!");
        int faku = sc.nextInt();
        System.out.println("ur faku is: " + fakumethod(faku));
    }

    public static long fakumethod(int newFaku) {

        if (newFaku <= 1) {
            return 1;

        } else {
            return newFaku * fakumethod(newFaku - 1);
        }

    }
    
}