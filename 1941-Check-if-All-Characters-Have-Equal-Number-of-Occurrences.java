class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }

        int j = map.values().iterator().next();

        for(int i : map.values()){
            if(i != j){
                return false;
            }
        }
        return true;
        
    }
}