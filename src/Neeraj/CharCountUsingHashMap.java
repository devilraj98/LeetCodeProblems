package Neeraj;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCountUsingHashMap {

    private static void characterCount(String str) {

      HashMap<Character,Integer> hmap =new HashMap<>();
      char arr[] =str.toCharArray();

        for (char c:arr) {
            if(hmap.containsKey(c))
                hmap.put(c,hmap.get(c)+1);
                else
                    hmap.put(c,1);

        }
        for (Map.Entry entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }



    public static void main(String[] args) {

        String str = "Ajit";
        characterCount(str);

    }


}
