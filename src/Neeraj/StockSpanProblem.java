package Neeraj;

import java.util.Stack;

public class StockSpanProblem {

    //     Brute force or two pointer or Sliding window problem
    //   Time complexity is n^2
 /*   private static void calculateSpan(int[] price, int n, int[] s) {

        for (int i = 0; i < n; i++) {
            int count =1;
            for (int j = i; j >=0 ; j--) {
                if(price[j]<price[i])
                    count++;

            }
            s[i]=count;

        }


    }
    */
 //  this is linear complexity problem
    private static int[] calculateSpan(int[] price, int n, int[] s) {

        Stack<Integer> stk= new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!stk.isEmpty() && price[stk.peek()] <= price[i])
                stk.pop();
            if (stk.isEmpty())
                s[i] = -1;
            else
                s[i] = stk.peek();

           stk.push(i);

        }
        for (int i = 0; i < n; i++) {
            s[i] = i - s[i];
        }
      return s;
    }
    public static void main(String[] args) {

        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int n = price.length;
        int s[] = new int[n];

        // Fill the span values in array S[]
         calculateSpan(price, n, s);

        // print the calculated span values
        printArray(s);

    }



    private static void printArray(int[] s) {

         for(int i :s)
             System.out.print(i+" ");


    }


}
