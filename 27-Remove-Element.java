class Solution {
    public int removeElement(int[] arr, int k) {
        int j = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] != k){
                arr[j] = arr[i];
                j++;
            }

        }

        return j;
        
    }
}