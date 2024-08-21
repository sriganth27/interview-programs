package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	
	private static int [] findTwoSum(int []nums , int target) {
		
		Map<Integer , Integer> m1 = new HashMap<>();
		
		for(int i=0 ; i<nums.length; i++) {
			int complement = target - nums[i];
			
			if(m1.containsKey(complement)) {
				return new int [] { m1.get(complement),i };
			}
			
			m1.put(nums[i] , i);
		}
		return new int [] {};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {2,5,7,1,8};
		int target = 13;
		
		int [] result = findTwoSum(nums, target);
		
		if(result.length ==2 ) {
			System.out.println("the target is "+result[0] +" and "+result[1]);
		}
		else {
			System.out.println("not found");
		}

	}

}
