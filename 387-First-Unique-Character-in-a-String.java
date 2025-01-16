class Solution {
    public int firstUniqChar(String str) {

        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
          for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i; // Return the index of the first unique character
            }
        }
        return -1;
    }
}