class Solution {
    public int findPeakElement(int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check the left neighbor only if mid > 0
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                // Peak lies on the left side
                right = mid - 1;
            } else {
                // Peak lies on the right side or mid is a peak
                left = mid + 1;
            }
        }
        
        return left - 1; // 'left' will point to the peak element after the loop
    }
}
