class Solution {
    public int maxFrequencyElements(int[] arr) {
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
                map.put(i , map.getOrDefault(i,0)+1);
            }
    
            int max = 0;
            for(int i : map.values()){
                if(i > max){
                    max = i;
                }
            }

        for(int i : map.values()){
            if(i == max){
                sum += i;
            }
        }
        return sum;
    }
}