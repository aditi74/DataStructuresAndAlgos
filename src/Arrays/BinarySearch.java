package Arrays;

/**
 * Created by 61310444 on 5/23/2016.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
       int search=  binarySearchIterative(arr,1,0,arr.length-1);
        System.out.println("Search successful :"+search);
    }

    public static int binarySearch(int[] arr,int num,int low,int high) {
        if(low <= high) {
            int mid = (low + high) / 2;

            if (num == arr[mid]) return mid;
            if (num < arr[mid]) return binarySearch(arr, num, low, mid - 1);
            if (num > arr[mid]) return binarySearch(arr, num, mid + 1, high);

        }
      return -1;}

    public static int binarySearchIterative(int[] arr,int num,int low,int high){
        while (low<=high)
        {
            int mid= (low+high)/2;
            if (arr[mid]< num )
                  low=mid+1;
            if (arr[mid]>num)
                high=mid-1;
            if (arr[mid]==num)
                return mid;
        }
        return -1;



    }


}
