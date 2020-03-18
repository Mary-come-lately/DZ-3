public class Second {
    public static void main(String[] args) {
        int []Array = new int[101];
        for (int i = 1; i < Array.length; i++) {
            Array[i] = i;
            if(Array[i] % 2 != 0){
                System.out.print(Array[i] + " ");
                //System.out.println(Array[i]);
            }
        }
        System.out.println("");

        for (int i = Array.length - 1; i > 0 ; i--) {
            Array[i] = i;
            if(Array[i] % 2 != 0){
                System.out.print(Array[i] + " ");
            }

        }
    }
}
