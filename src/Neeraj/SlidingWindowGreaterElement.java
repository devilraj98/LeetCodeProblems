package Neeraj;

import java.util.Stack;

public class SlidingWindowGreaterElement {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n= nums.length;
        Stack<Integer> stk = new Stack<>();
        int nge[] = new int[n];
        //  ans[n-1] = n;
        for (int i = n-1; i >=0 ; i--) {

            while (!stk.isEmpty() && nums[stk.peek()] <= nums[i])    //
                stk.pop();

            if (stk.isEmpty())
                nge[i] =n;

            else nge[i] =stk.peek();

            stk.push(i);         //pushing address of element
        }
        int arrRes[] = new int[n-k+1];
        for(int i = 0;i <= n-k; i++)
        {
            int j = i;
            while(nge[j] < i+k)
            {
                j=nge[j];
            }
            arrRes[i] = nums[j];
        }
        return arrRes;
    }



    public static void main(String[] args) {
        int nums[] ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int arr[] =maxSlidingWindow(nums, k);

        for (int i :arr) {
            System.out.print(i+" ");

        }
    }

}
