package Neeraj;

public class StockSpanProblem {

    private static void calculateSpan(int[] price, int n, int[] s) {

        for (int i = 0; i < n; i++) {
            int count =1;
            for (int j = i; j >=0 ; j--) {
                if(price[j]<price[i])
                    count++;

            }
            s[i]=count;

        }


    }
    public static void main(String[] args) {

        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);

    }

    private static void printArray(int[] s) {

         for(int i :s)
             System.out.print(i);


    }


}
