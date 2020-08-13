import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> prevMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];

                if (prevMap.containsKey(diff)) {
                    return new int[]{ prevMap.get(diff), i };
                }
                prevMap.put(nums[i], i);
            }
            return new int[0]; // Guranteed solution, no need for return
        }
        public static void main(String[] args){
            int[] aabb = new int[]{3,6,9,12,13};
            int b = 16;
            twoSum n = new twoSum();

            System.out.println(Arrays.toString(n.twoSum(aabb, b)));
        }
    }
