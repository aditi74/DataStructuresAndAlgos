package Arrays;

/**
 * Created by 61310444 on 6/19/2016.
 */
public class ParseIntImplementation {

    public static void main(String[] args) {


    }

    public Integer parseIntImplement(String str) {

        int num=0;
        for (int i = 0; i < str.length(); i++)
        {
            if ((int)str.charAt(i)  >=48 &&    (int)str.charAt(i)<=57)
            {
                num=num*10+ ((int)str.charAt(i)-48);
            }
        }

        return num;

    }
}
