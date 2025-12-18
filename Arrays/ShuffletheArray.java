package LEETCODE.Arrays;

public class ShuffletheArray {
    //Shuffle the Array

    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        int a =0;
        for(int i = 0 ; i< nums.length; i++){
            if(i%2 == 0){
                answer[i] = nums[i/2];
            }
            if(i%2 != 0){
                answer[i] = nums[n+a];
                a++;
            }
        }
        return answer;
    }

    //Opitimised solution
    //  public int[] shuffle(int[] nums, int n) {
    //        int res[] = new int[2 * n];
    //        for (int i = 0,j = 0; i < n; i++,j = j + 2) {
    //            res[j] = nums[i];
    //            res[j + 1] = nums[i + n];
    //        }
    //        return res;
    //    }
}
