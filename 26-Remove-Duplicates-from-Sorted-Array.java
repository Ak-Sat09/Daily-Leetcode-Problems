class Solution {
    public int removeDuplicates(int[] arr) {
        int unique[] = Arrays.stream(arr).distinct().toArray(); 
         System.arraycopy(unique, 0, arr, 0, unique.length);
        return unique.length;
    }
}