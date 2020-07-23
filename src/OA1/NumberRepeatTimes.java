package OA1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberRepeatTimes {
	public List<Integer> majorityElement(int[] nums) {
        if(nums.length< 1)
            return null;
        Set<Integer> result = new HashSet<>();
        int minNeeded = nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);            
            if(map.get(num) > minNeeded)
                result.add(num);
        }
        return new ArrayList<>(result);
    }
}
