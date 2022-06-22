package prk02;

import java.util.*;
public class rand{

    public static void main(String[] args) {
        Random zufall = new Random();
        int dice = 0;
        while (dice < 6){
            dice = zufall.nextInt(6)+1;
            System.out.println("diced number " + dice);
        }


    }

} 