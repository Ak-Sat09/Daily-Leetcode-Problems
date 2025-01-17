class Solution {
    public static int firstIndex(int arr[] , int target){
        int left = 0;
        int right = arr.length-1;
        int index = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
               index = mid;
               right = mid -1;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return index;
   
    }
        public static int lastIndex(int arr[] , int target){
        int left = 0;
        int right = arr.length-1;
        int index = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
               index = mid;
               left = mid+1;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return index;
   
    }
    public int[] searchRange(int[] arr, int target) {
         int[] result = new int[2];
        result[0] = firstIndex(arr, target);
        result[1] = lastIndex(arr, target);
        return result;
        }
}