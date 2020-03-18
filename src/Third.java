public class Third {
    public static void main(String[] args) {
        int []Array = new int[15];
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = ((int)(Math.random() * 100));
            System.out.print(Array[i] + " ");
            if(Array[i] % 2 ==0){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
