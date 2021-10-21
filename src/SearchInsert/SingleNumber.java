package SearchInsert;

import java.util.*;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        HashSet<Integer> hash2 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(nums[i])) {
                hash.put(nums[i], 1);
            } else if (hash.containsKey(nums[i])) {
                hash.put(nums[i], 2);
            }
        }

            //using Hashset
            HashSet<Integer> set=new HashSet<>();
            for(int i:nums)
            {
                if(set.contains(i))
                    set.remove(i);
                else
                    set.add(i);
            }
            for(int i:set)
            {
                return i;
            }
            return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 5, 5, 5, 4};
        System.out.println(singleNumber(array));
    }
}
