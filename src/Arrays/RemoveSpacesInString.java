package Arrays;

/**
 * Created by 61310444 on 7/20/2016.
 * Write a program to compact spaces in a string i.e. Given a string
 * you have to remove multiple occurrences of blank spaces by a single space and do that in a single pass of the arrays
 String s="ad asda asd asd    adasd";
 */
public class RemoveSpacesInString {
    public static void main(String[] args) {
        String s= "ad asda asd asd    adasd";//String Literal ,created in String pool
        System.out.println(removeSpaces(s));

    }

    public static String removeSpaces(String str)
    {
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<str.length()-2;i++)
        {
            if (str.charAt(i)==' ' && str.charAt(i+1)==' ')
                continue;
            else
                stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();

    }
}
