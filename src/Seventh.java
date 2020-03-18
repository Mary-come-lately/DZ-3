public class Seventh {
    public static void main(String[] args) {
        int []Array = new int[12];
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 16);
            System.out.print(Array[i] + " ");
            if(maxNumber <= Array[i]){
                maxNumber = Array[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("The biggest element is - " + maxNumber);
        System.out.println("The last entry of the biggest element - " + maxIndex);

    }
}
