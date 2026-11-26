class Solution {
    public int[] twoSum(int[] nums, int target) {
        //(target-nums[i], i)
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        // target - nums[i] = lookingFor
        //  if lookign for exists in the array then add i and lookingForIndex to res.
        for (int i = 0; i < nums.length; i++) {
            // int lookingFor = target - nums[i];
            if (map.containsKey(nums[i])) {
                // get the index of the elemnet
                res[0] = map.get(nums[i]);
                // curr index
                res[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }

        return res;
    }
}
