class Solution {
    public int maxSubArray(int[] arr) {

        int currMax = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(currMax < 0){
                currMax = arr[i];
            }
            else{
                currMax = currMax+arr[i];
            }
            max = Math.max(max,currMax);
        }
      return max;
    }
}
