package Neeraj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCountUsingHashMap {

    private static void characterCount(String str) {

        HashMap<Character,Integer> hm = new HashMap<>();
        char arr[] =str.toCharArray();

        for (char c:arr) {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

      /*  for (char key : hm.keySet()) {
            System.out.println(key);;
        }
     */

   /*     System.out.println();

        Iterator<Character> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+" ");
        }
*/
    /*    System.out.println();

        hm.keySet().iterator()
                .forEachRemaining(System.out::println);
*/
        System.out.println();
        for (Map.Entry entry : hm.entrySet())
            System.out.println(entry.getKey()+"  "+entry.getValue());

    }



    public static void main(String[] args) {

        String str = "Ajit";
        characterCount(str);

    }


}
