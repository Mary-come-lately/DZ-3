public class Fourth {
    public static void main(String[] args) {
        int []Array = new int[20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int)(Math.random() * 21);
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Array.length; i++){
            Array[i] = (int)(Math.random() * 21);
            if(i % 2 != 0) {
                Array[i] = 0;
            }
            System.out.print(Array[i] + " ");
        }
    }
}
