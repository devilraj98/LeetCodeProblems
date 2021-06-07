package Neeraj;

import java.util.Stack;

public class PGE {

    private static int[] PGECalculate(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int []ans = new int[n];
        for (int i = 0; i < n; i++) {

            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i])
            {
                stk.pop();
            }
            if(stk.isEmpty())
                ans[i]= -1;

            else
                ans[i] =stk.peek();

            stk.push(i);
        }

    return ans;


    }
    public static void main(String[] args) {

        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;


        int res[] = PGECalculate(arr,n);

        for (int i :res)
            System.out.print(i+",");

        }


    }




