class Solution {
    public int[] singleNumber(int[] arr) {

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res[] = new int[2];
         int index =0 ;
        for(Map.Entry<Integer , Integer> ent : map.entrySet()){
            if (ent.getValue() == 1) {
                res[index++] =  ent.getKey();
            }
        }
        return res;
        
    }
}