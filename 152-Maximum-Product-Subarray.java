class Solution {
    public int maxProduct(int[] arr) {

        int pf = 1;
        int max1 = Integer.MIN_VALUE;
        int pf2 = 1;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(pf == 0){
                pf = arr[i];
            }       
            else{
                pf = pf*arr[i];
            }
            max1 = Math.max(max1 , pf);
        }

        for(int i = arr.length-1; i>=0; i-- ){
              if(pf2 == 0){
                pf2 = arr[i];
            }       
            else{
                pf2 = pf2*arr[i];
            }
            max2 = Math.max(pf2,max2);

        }
        return Math.max(max1 , max2);
    }
}