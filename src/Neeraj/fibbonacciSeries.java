package Neeraj;

public class fibbonacciSeries {

   
 int coutn = 0;

    int fib(int n) {
        coutn++;
        int ans[] =new int[11];
        ans[0] =0;
        ans[1] =1;
        
        for(int i =2;i<11;i++)
        {
            ans[i] =ans[i-1]+ans[i-2];
        }

        return ans[n];

    }
    public static void main(String[] args) {
        
        fibbonacciSeries ob =new fibbonacciSeries();
        int n =10;
        System.out.println(ob.fib(n));
        System.out.println(ob.coutn);
    }

  
    
}
