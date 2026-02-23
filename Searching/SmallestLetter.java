package LEETCODE.Searching;
///
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/44
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c' , 'f' , 'j'};
        char target = 'c';
        char ans = nextGreaterNumber(arr,target);
        System.out.println(ans);
    }
    public static  char nextGreaterNumber(char[] letters , char target){
        int start = 0;
        int end = letters.length;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start  = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
