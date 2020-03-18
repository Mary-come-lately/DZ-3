import java.util.Arrays;
import java.util.Random;

public class Eighth{
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 10;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        //Массив 1
        for (int i = 0; i < size; i++) {
            arr1[i] = rand.nextInt(9);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //Массив 2
        for (int i = 0; i < size; i++) {
            arr2[i] = rand.nextInt(9);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //Массив 3
        double[] arr3 = new double[size];
        for (int i = 0; i <size ; i++) {
            arr3[i] =(double) arr1[i] / arr2[i];
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        //Массив 3. Целые числа.
        for (int i = 0; i < size; i++) {
            arr3[i] = (double)arr1[i] / arr2[i];
            if(arr3[i] % 1 ==0){
                System.out.print((int)arr3[i] + " ");
            }
        }
    }
}
