import java.util.Random;

public class First {
    public static void main(String[] args) {
        int[]Array = new int[21];
        for (int i = 2; i < Array.length; i++) {
            Array[i] = i;
            if(Array[i] % 2 == 0){
                 System.out.print(Array[i] + " ");
               // System.out.println(Array[i]);
            }

        }
    }
}
