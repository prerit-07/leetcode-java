package LEETCODE.Sorting;

//268
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};


    }


    public void missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
//
//        for(int j = 0;j < nums.length;j++){
//            if(nums[j] != j){
//                return j;
//            }
//        }
//        return nums.length;

    }
    void swap(int[] arr ,int i , int correct){
        int  temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }




 //Best solution
//    public int missingNumber(int[] nums) {
//
//        int n = nums.length;
//        int expectedSum = n * (n + 1) / 2;
//
//        int actualSum = 0;
//        for(int num : nums) {
//            actualSum += num;
//        }
//
//        return expectedSum - actualSum;
//    }
}
