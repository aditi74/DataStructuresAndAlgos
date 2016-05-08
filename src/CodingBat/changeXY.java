package CodingBat;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class changeXY {

    public static void main(String[] args) {
        String change=changeXY("xxhixx");
        System.out.println(change);
    }

    public static String changeXY(String str) {


        if (str.length()==0) return "" ;

        if   (str.charAt(0) =='x')
            return str.replace('x','y');


        return  str.charAt(0)+ changeXY(str.substring(1));

    }

}
