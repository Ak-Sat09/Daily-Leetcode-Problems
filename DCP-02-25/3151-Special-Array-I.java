class Solution {
    public boolean isArraySpecial(int[] arr) {
        if(arr.length == 1)return true;
        for(int j=1; j<arr.length; j++){
            if((arr[j]%2) == arr[j-1] % 2){
                return false;
            }

        }
        return true;
    }
}