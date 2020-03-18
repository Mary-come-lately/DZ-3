public class Fifth {
    public static void main(String[] args) {

        //Массив 1
        int []Array1 = new int[5];
        int sum1 = 0;
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int)(Math.random() * 16);
            System.out.print(Array1[i] + " ");
            sum1 += Array1[i];
        }
        System.out.println();
        System.out.println(sum1);
       int average1 = sum1/Array1.length;
        System.out.println(average1);

        System.out.println();

        //Массив 2
        int []Array2 = new int[5];
        int sum2 = 0;
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = (int)(Math.random() * 16);
            System.out.print(Array2[i] + " ");

            sum2 += Array2[i];
        }
        System.out.println();
        System.out.println(sum2);
        int average2 = sum2/Array2.length;
        System.out.println(average2);

        if (average1 > average2){
            System.out.println("Average of 1 array > then second");
        }
        else if(average2 > average1){
            System.out.println("Average of 2 array > then first");
        }
        else
            System.out.println("Averages is the same");

    }
}
