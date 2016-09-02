package Java;

import java.util.HashSet;

/**
 * Created by 61310444 on 7/13/2016.
 */
public class UseOfSetsAndMaps {
    public static void main(String[] args) {
        HashSet<String> hashset= new HashSet<>();
        hashset.add("Java");
        hashset.add("Sets");
        hashset.add("String");
        hashset.add("Java");
        hashset.add(null);
        System.out.println("Hashset is + "+hashset);

    }


}
