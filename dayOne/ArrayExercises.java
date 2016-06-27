package dayOne;

/**
 * //Array exercises
 * Created by student on 27-Jun-16.
 */
public class ArrayExercises {

    public static void main(String[] args) {

        int[] test = {};
        int[] a = {1,2,3};
        int[] b = {7,6};
        int[] nums = {1,1,1};

        System.out.println(countEven(nums));

    }

    static boolean firstLast6(int[] nums) {

        return ((nums[0] == 6) || (nums[nums.length - 1] == 6)) ;

    }

    static boolean sameFirstLast (int[] nums){

        return ((nums.length >= 1 ) && (nums[0] == nums[nums.length -1]));
    }

    static boolean commonEnd (int[] a, int[] b){

        return ((a[0] == b[0]) || (a[a.length -1] == b[b.length -1])
                && ((a.length >=1) && (b.length >=1)));
    }

     public static int[] maxEnd3(int[] nums){

        int max;

        if (nums[0] > nums[nums.length -1])
        {
            max = nums[0];
        }
        else
        {
            max = nums[nums.length -1];
        }

         nums[0] = max;
         nums[1] = max;
         nums[2] = max;

         return  nums;
    }

    public static int countEven( int[] nums){

        int even = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i ++ ){

            if (nums[i] % 2 == 0){
                even += i;
            }
            result = even;
        }
        return result;
    }
}
