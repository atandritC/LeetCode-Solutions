class Solution {
    public int findMin(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;

        if (arr[low] < arr[high])
            return arr[low];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= arr[low]) {
                minEle = Math.min(minEle, arr[low]);
                low = mid + 1;
            } else {
                minEle = Math.min(minEle, arr[mid]);
                high = mid - 1;
            }
        }

        return minEle;
    }
}