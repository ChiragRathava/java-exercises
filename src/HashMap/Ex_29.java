// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex_29 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum(nums,target);

        if (result != null)
        { System.out.println("[" + result[0] + "," + result[1] + "]"); }
        else
        { System.out.println("Not solve."); }
    }

    public static int[] TwoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement))
            {
                return new int[] {map.get(complement),i };
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

