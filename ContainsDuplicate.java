package LeetCode;

import java.util.LinkedHashSet;

public class ContainsDuplicate {
	

	    public boolean containsDuplicate(int[] nums) {
	        
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for(int num : nums){
	            if(!set.add(num))
	                return true;
	            
	        }
	        return false;

	    }

	    public static void main(String[] args){
	        int arr[] = {1,2,3,1} ;
	        ContainsDuplicate sol = new ContainsDuplicate() ;
	        System.out.println(sol.containsDuplicate(arr)) ;
	    }
	}



