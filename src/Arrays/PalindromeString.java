package Arrays;

/**
 * Created by 61310444 on 6/11/2016.
 */
public class PalindromeString {

    public static void main(String[] args) {
        String str= "A man, a plan, a canal: Panama";
       // String str1="""";
        PalindromeString pa=new PalindromeString();
       int num= pa.isPalindrome(str);
        System.out.println(num);
    }
    public int isPalindrome(String a) {
        String str= a.replaceAll("[^A-Za-z0-9]","");

        String newStr= str.toLowerCase();

        int len=newStr.length();
        int i=0;
        int j=len-1;
        while(i <len/2 )
        {
            if (newStr.charAt(i)!=newStr.charAt(j))
                return 0;
            i++;
            j--;

        }
        return 1;
    }
}
