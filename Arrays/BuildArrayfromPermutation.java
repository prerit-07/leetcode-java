package LEETCODE.Arrays;
//1920
public class BuildArrayfromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i= 0; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //most optimised
//        public int[] buildArray(int[] nums) {
//        int[] ans=new int[nums.length];
//        return result(0,ans,nums);
//    }
//
//    public int[] result(int index, int[] ans, int[] nums){
//        if(index==nums.length){
//            return ans;
//        }
//        ans[index]=nums[nums[index]];
//        return result(index+1,ans,nums);
//    }
}

