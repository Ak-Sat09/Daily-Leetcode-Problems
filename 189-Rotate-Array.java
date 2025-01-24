class Solution {
    public static void rev(int arr[] , int left , int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k%n;

        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        
    }
}