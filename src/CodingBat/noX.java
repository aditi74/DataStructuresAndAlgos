package CodingBat;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class noX {

    public String noX(String str) {
        if (str.length()==0) return "";
        if (str.charAt(0)=='x')
            return noX(str.substring(1)) ;
        return str.charAt(0)+ noX(str.substring(1));

    }


}
