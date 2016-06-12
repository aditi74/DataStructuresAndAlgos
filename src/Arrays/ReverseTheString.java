package Arrays;

/**
 * Created by 61310444 on 6/12/2016.
 */
public class ReverseTheString {

    public static void main(String[] args) {
       String str="the  sky  is  blue";
       // ReverseTheString rev=new ReverseTheString();
      //  rev.reverseWords(str);

       String[] arr= str.split(" ");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }

       StringBuilder sb=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--)
        {
            if (!arr[i].equals("")/* || !arr[i].equals(" ")*/)
            {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }

    public String reverseWords(String str) {

        String[] arr= str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        StringBuilder sb=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--)
        {
            if (!arr[i].equals("")/* || !arr[i].equals(" ")*/)
            {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }

}
