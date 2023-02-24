package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountain(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while (start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in descending order
                end = mid;
            }
            else{
                //you are in ascending order .
                start= mid + 1;
            }
        }
        return start;
    }

}
