class Solution {
    public int maxSubArray(int[] arr) {
        int curr = 0;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            curr = Math.max(arr[i] , arr[i]+curr);
            max = Math.max(curr,max);
        }
        return max;
        }
}
