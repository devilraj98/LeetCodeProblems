package Neeraj;


//top down approach
public class FibbonacciSeries {
  
  final int nill =-1;
   int count =0;
 final  int max=101;
  int[]  memo =new int[max];

   void lookUp()
   {
      for (int i =0;i<max;i++)
      {
          memo[i] =nill;
      }

   }

    int fib(int n)
   {   
       count++;
      
       if(memo[n] ==nill)
       {
           if(n<=1)
            return memo[n]=n;
            else
             memo[n] =fib(n-1)+fib(n-2);
       }
       
       return memo[n];

   }

     public static void main(String[] args) {
            FibbonacciSeries fb =new FibbonacciSeries();
        

            int n =100;
             fb.lookUp();


        System.out.print("fib of n is"+" ="+fb.fib(n));
       
        System.out.println();
   
        System.out.println("count is"+" ="+fb.count);
        
    }

}
