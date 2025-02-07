class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length; 
        int total = 0;
        int expected = n*(n+1)/2;

        for(int i=0; i<n; i++){
            total += arr[i];
        }
        return expected-total;
    }
}