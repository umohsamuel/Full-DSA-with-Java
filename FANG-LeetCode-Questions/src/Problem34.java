//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

import java.util.Arrays;

public class Problem34 {

    public static void main(String[] args) {
        int[] aryh = {6, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(aryh, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = searcher(nums, target, true);
        int end = searcher(nums, target, false);

        ans[0] = start;
        ans[1] = end;

//        System.out.println(Arrays.toString(ans));
        return ans;

    }

    static int searcher(int[] nums, int target, boolean isFirstElement) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (isFirstElement) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
