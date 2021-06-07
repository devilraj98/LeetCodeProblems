package Neeraj;

public class countCharInString {

    public static void countChar(String s) {
      char arr[] = s.toCharArray();
        int ans[] = new int[26];
          for(int i  = 0;i< arr.length;i++)
          {
              int count =0;

              for (int j = 0; j < arr.length; j++) {

                  if (j<i && arr[i]==arr[j])
                      break;
                  if(arr[i]==arr[j])
                  {
                     count++;
                  }
                  if(j==arr.length-1)
                  {
                      System.out.println(arr[i]+" "+"is occuring "+ count+" " +" "+"times");
                  }
              }

          }

    }
    public static void main(String[] args) {
        String s = "abaababcdelkm";

        countChar(s);
       //int []res =  countChar(s);
     //

    }


}
