package LEETCODE.Searching;
//704
public class BinarySearch {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length -1;
        int result =-1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(target < nums[mid]){
                end = mid -1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }
}
