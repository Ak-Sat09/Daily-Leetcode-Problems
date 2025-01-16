class Solution {
    public boolean canConstruct(String ran, String mag) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : mag.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : ran.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch , map.get(ch)-1);
        }
        return true;
        
    }
}