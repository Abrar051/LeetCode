package SearchInsert;
import java.*;
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        /*if (nums.length==0)
        {
            return 0;
        }
        else if (nums.length==1)
        {
            if (nums[0]>target)
            {
                return 0;
            }
            else if (nums[0]<target)
            {
                return 1;
            }
        }
        else if (nums.length==2)
        {
            if (nums[0]<target && nums[1]>target)
            {
                return 1;
            }
        }
        else
        {
            for (int i=0;i< nums.length;i++)
            {
                if (nums[i]==target)
                {
                    return i;
                }
                else if (target<nums[0] || target>nums[nums.length-1])
                {
                    if (target<nums[0])
                    {
                        return 0;
                    }
                    else
                    {
                        return nums.length;
                    }
                }
                else if (i!=0 && i!=(nums.length-1))
                {
                    if (nums[i-1]<target && nums[i]>target)
                    {
                        return i;
                    }
                }

            }
        }
        return 0;*/

        int mid = 0;
        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            mid = l+(r-l)/2;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] > target)
                r = mid-1;

            else if(nums[mid] < target)
                l = mid+1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] array = new int[4];
        int target = 5;
    }
}