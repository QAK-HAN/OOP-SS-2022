import java.util.Random;

public class Messwerte {
    static int[] timeInHours = new int[23];
    static double[] tempInC = new double[99];

    public static void main(String[] args) {
        System.out.println("Um " + findMaxHour() + " Uhr war es am wärmsten mit " + findMax() + " °C");
        System.out.println("Um " + findMinHour() + " Uhr war es am kätesten mit " + findMin() + " °C");
    }

    public static void arrayHour() {
        for (int i = 0; i < timeInHours.length; i++) {
            timeInHours[i] = i;
        }

    }

    public static void tempInC() {
        Random temp = new Random();
        for (int i = 0; i < timeInHours.length; i++) {
          double tempVariable = temp.nextDouble(0 - 100);
          tempInC[i] = tempVariable;
        }
    

    }

    public static double findMax() {
        double maxValue = -Double.MAX_VALUE;
        for (int i = 0; i < tempInC.length; i++) {
            if (maxValue <= tempInC[i]) {
                maxValue = tempInC[i];
            }

        }
        return maxValue;
    }

    public static int findMaxHour() {
        double maxValue = -Double.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < tempInC.length; i++) {
            if (maxValue <= tempInC[i]) {
                maxValue = tempInC[i];
                count = i + 1;
            }
        }
        return count;
    }

    public static double findMin() {
        double maxValue = Double.MAX_VALUE;
        for (int i = 0; i < tempInC.length; i++) {
            if (maxValue >= tempInC[i]) {
                maxValue = tempInC[i];
            }
        }
        return maxValue;
    }

    public static int findMinHour() {
        double maxValue = Double.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < tempInC.length; i++) {
            if (maxValue >= tempInC[i]) {
                maxValue = tempInC[i];
                count = i + 1;
            }
        }
        return count;
    }

}