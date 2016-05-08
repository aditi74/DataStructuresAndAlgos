package CodingBat;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class changePi {
    public static void main(String[] args) {
        System.out.println(  changePi("xpix"));
    }

    public static String changePi(String str) {
        if (str.length()==0) return "";

        if (str.startsWith("pi"))
            return "3.14"+changePi(str.substring
                    (2));

        return str.charAt(0)+ changePi(str.substring(1));
    }

}
