package CodingBat;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class countX {

    public static void main(String[] args) {
       int count= countX("xxhixx");
        System.out.println(count);
    }
    public static int countX(String str) {

        if (str.length()==0)
            return 0;

        return (str.charAt(0)=='x'? 1:0) + countX(str.substring(1));

    }

}
