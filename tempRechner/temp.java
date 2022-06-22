import java.util.*;

public class temp {
    public static void main(String[] args) {
        
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("typ a number °F °C");
    
            int input = sc.nextInt();
            int FromfToC = (input - 32) * 5/9 ;
            System.out.println(FromfToC); 
            System.out.println("giv n or j");

            if(sc.next().equals("n")) break;
        }
       
        
        
    }
    
}
