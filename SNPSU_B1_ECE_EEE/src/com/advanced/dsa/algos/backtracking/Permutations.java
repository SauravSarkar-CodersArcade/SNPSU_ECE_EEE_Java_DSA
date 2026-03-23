package com.advanced.dsa.algos.backtracking;
import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        backtrack(arr, result, new ArrayList<>(), used);
        System.out.println(result);
    }
    static void backtrack(int[] nums,
        List<List<Integer>> result, List<Integer> temp,
        boolean[] used){
        if (temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0; i< nums.length; i++){
            if (used[i]) continue;
            temp.add(nums[i]);
            used[i] = true;
            backtrack(nums, result, temp, used);
            // Backtrack
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
