public class Sixth {
    public static void main(String[] args) {

        int []Array = new int[4];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int)(Math.random() * 11);
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        for (int i = 1; i < Array.length; i++) {
            if(Array[i]<=Array[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Ascending");
        } else {
            System.out.println("Not Ascending");
        }
    }
}
