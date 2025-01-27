class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }  
        int length = 0;
        for(int i : map.values()){
            if(i % 2 == 0){
                length += i;
            }else{
                length += i-1;
            }
        }    
        if(length < s.length())length++;    
        return length;
    }
}