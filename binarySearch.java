class Solution {
    int binarySearch(int start, int end, int[] arr, int t){
        if (arr == null || arr.length == 0) return -1;
        while(start < end){
            int mid = start + (end-start) / 2;
            // System.out.println(arr[mid]);
            if(arr[mid] == t) return mid;
            if(arr[mid] < t){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] nums = {1,5,9,10,18,60,88};
        int target = 10;
        int ans = binarySearch(0, nums.length, nums, target);
        System.out.print("Index of target ", ans);
    }
}
