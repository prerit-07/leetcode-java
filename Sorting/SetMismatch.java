package LEETCODE.Sorting;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans ={0,0};
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;

    }
    void swap(int[] arr ,int i , int correct){
        int  temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
