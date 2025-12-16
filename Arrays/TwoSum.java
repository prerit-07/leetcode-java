package LEETCODE.Arrays;
//1
public class TwoSum {
    //my solution
        public int[] twoSum(int[] arr, int target) {
            int l = arr.length;
            for(int i = 1; i<l; i++){
                for(int j = 0; j<l-i; j++){
                    if(arr[j] + arr[j+i] == target) return new int[]{j, j+i};
                }
            }

            return new int[]{};
        }

        //Best optimised solution
//    public int[] twoSum(int[] arr, int target) {
//        int l = arr.length;
//        for(int i = 1; i<l; i++){
//            for(int j = 0; j<l-i; j++){
//                if(arr[j] + arr[j+i] == target) return new int[]{j, j+i};
//            }
//        }
//
//        return new int[]{};
//    }

    }
