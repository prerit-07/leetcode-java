package LEETCODE.Searching;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int  start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid]  > arr[mid + 1]) {
                //you are in dec  part of array
                //this may be the answer, but look at left
                //this is why end != mid - 1
                end = mid;
            } else {
                //you are in ascendeing part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        //in the end , start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointint to just one elemnt,
        return start; // or return end both are equal
    }
}
