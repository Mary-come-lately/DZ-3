import java.util.Random;
import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        if(number < 3){
            System.out.println("Enter the number more than 3");
        }
        else System.out.println(number);

        Random rand = new Random();
        int[]arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = rand.nextInt(number);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[]arr2 = new int[number];
        for (int i = 0; i < number; i++) {
            if(arr[i] % 2 ==0){
                arr2[i] = arr[i];
                System.out.print(arr2[i] + " ");
            }

        }
    }
}
