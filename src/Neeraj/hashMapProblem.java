package Neeraj;
import java.util.HashMap;

public class hashMapProblem {
    
    static void createHashMap(int[] arr) {
    
    
    HashMap<Integer,Integer> hm =new HashMap<>();

       for (int i = 0; i < arr.length; i++) {
         
        Integer count =hm.get(arr[i]);

          if(hm.get(arr[i]) == null)
          {
              hm.put(arr[i], 1);
          }
          else
             {
                  hm.put(arr[i],++count);
             }
        }
    
    
    }



    public static void main(String[] args)
    {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
    createHashMap(arr);
    }

  
}
