package CodingBat.Recursion;

/**
 * Created by 61310444 on 5/8/2016.
 */
public class recursion {

    /*Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0*/
    public boolean array6(int[] nums, int index) {
        if (nums.length==index) return false;

        if (nums[index]==6) return true;

        return array6(nums,index+1);


    }

   // Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
   public int array11(int[] nums, int index) {
       if (nums.length==index) return 0;
       return (nums[index]==11?1:0)+ array11(nums,index+1);
   }

    //Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

    public boolean array220(int[] nums, int index) {
        if (index==nums.length) return false;

        if (index+1< nums.length && nums[index+1]==10*nums[index]) return true;

        return array220(nums,index+1);
    }

    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

    public String allStar(String str) {
        if (str.length()<2) return str;


        return str.charAt(0)+ "*"+ allStar(str.substring(1));


    }






}
