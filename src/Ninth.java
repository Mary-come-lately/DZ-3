import java.util.Random;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        Random rand = new Random();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = rand.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int size=array.length/2;
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 0;i < size;i++){
            sumLeft += array[i];
        }
        for (int i = size;i < array.length;i++){
            sumRight += array[i];
        }
        if (sumLeft > sumRight)
            System.out.println(sumLeft + " > "+ sumRight);
        else System.out.println(sumRight + "  > " + sumLeft);

        }
    }
