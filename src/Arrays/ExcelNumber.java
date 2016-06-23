package Arrays;

import java.util.HashMap;

/**
 * Created by 61310444 on 6/19/2016.
 */
public class ExcelNumber {


    public static void main(String[] args) {
        String a= "A";
        int num= (int)a.charAt(0)-65+1;
        System.out.println(num);

        ExcelNumber ex = new ExcelNumber();
        String str=ex.convertToTitle(980089);

        System.out.println(str);
    }
    public int titleToNumber(String a) {

        int num=0;

        for (int i=0;i< a.length();i++)
        {
            num=num*26+ ((int)a.charAt(i)-65+1);
        }

        return num;
    }
    public String convertToTitle(int a) {

        StringBuilder sb = new StringBuilder();
        while(a > 0){
            a--;
            char ch = (char) (a % 26 + 'A');


            a /= 26;
            sb.append(ch);
        }

        sb.reverse();
        return sb.toString();
    }

}
