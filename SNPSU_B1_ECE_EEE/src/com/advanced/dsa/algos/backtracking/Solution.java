package com.advanced.dsa.algos.backtracking;
import java.util.ArrayList;
import java.util.List;
class Solution {
    private void solve(int[] nums, List<Integer> output,
                       int index, List<List<Integer>> ans){
        // Base Case -> moment index is == length or out of loop
        if (index >= nums.length){
            ans.add(new ArrayList<>(output)); // Add a copy of the output
            return;
        }
        // Exclude Case -> Skip the current index & move one step
        solve(nums, output, index+1, ans);
        // Include Case -> Take the current element & move one step
        output.add(nums[index]);
        solve(nums, output, index+1, ans);
        // Remove the last answer to store the next answer
        output.remove(output.size()-1);  // Backtracking
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4,5,6};
        List<List<Integer>> result = s.subsets(nums);
        for (List<Integer> subset : result){
            System.out.print(subset + " ");
        }
    }
}