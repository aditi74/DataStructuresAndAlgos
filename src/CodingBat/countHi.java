package CodingBat;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class countHi {
    public int countHi(String str) {
        if (str.length()==0) return 0;

        return (str.startsWith("hi")?1:0) +countHi(str.substring(1));
    }

}
