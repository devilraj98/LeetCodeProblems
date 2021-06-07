package Neeraj;

public class StringsAnagrams {


    public static void main(String[] args) {

        String s = "ababa";
        String t = "babaas";

        char s1[] =s.toCharArray();
        int fre[] =new int[26];

        char t1[] =t.toCharArray();
        int fre2[] =new  int[26];

        for (int i = 0; i <s.length(); i++) {
             fre[s1[i]-'a']++;

        }
        for (int i = 0; i <t.length(); i++) {
            fre2[t1[i]-'a']++;

        }

        for (int i = 0; i <= 26; i++) {

            if (fre[i] != fre2[i])
            {
                System.out.println("not a anargam");

              }


        }













    }


}
