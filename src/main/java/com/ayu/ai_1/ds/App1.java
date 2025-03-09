package com.ayu.ai_1.ds;

import java.util.Arrays;

public interface App1 {
  static void main(String[] args) {
    int[] nums = new int[] {1, 2, 3, 3, 3, 4, 4, 5};

    print(nums, "before");
    int[] numSet = removeDuplicatesFromSortedArray(nums);
    print(numSet, "after");
  }

  static void print(int[] nums) {
    print(nums, "");
  }

  static void print(int[] nums, String tag) {
    String prefix = String.format("%10s", tag.isBlank() ? "" : tag + " :");
    System.out.println(prefix + Arrays.toString(nums));
  }

  static int[] removeDuplicatesFromSortedArray(int[] nums) {
    int i = 0, k = 1;
    for (; k < nums.length; k++) {
      if (nums[i] != nums[k]) {
        i++;
        nums[i] = nums[k];
      }
    }
    return Arrays.copyOfRange(nums, 0, i + 1);
  }
}
