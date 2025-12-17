package LEETCODE.Arrays;

import java.util.Arrays;

//1929
public class ConcatenationofArray {
    public static void main(String[] args) {
        int[]nums = {1,2,1};
        int[] answer =getConcatenation(nums);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i =0; i<ans.length; i++){
            if(i <  nums.length){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
    }

//     best in this case
//        public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[2 * n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = ans[i + n] = nums[i];
//        }
//        return ans;
//    }
}
