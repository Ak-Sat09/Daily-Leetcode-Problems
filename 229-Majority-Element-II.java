 class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add elements that appear more than n/3 times to the result
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                list.add(key);
            }
        }

        return list;
    }
}
