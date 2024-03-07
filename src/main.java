import java.util.Random;

public class main {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        int i = 0;
        Random rand = new Random();
        while (i< 10) {

            int number = rand.nextInt(100) + 1;


            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }


            i++;
        }


        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}


