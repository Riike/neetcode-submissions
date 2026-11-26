class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNums = HashSet.newHashSet(nums.length);
        for (int num : nums) {
            uniqueNums.add(num);
        }
        return uniqueNums.size() != nums.length;
    }
}