package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	
	
	
	    public int[] twoSum(int[] nums, int target) {
	        for(int i = 0;i<nums.length;i++){

	            for(int j = i+1;j<nums.length;j++)
	            {
	                if(nums[i] + nums[j] == target)
	                    return new int[]{i,j};

	            }
	        }
	        return new int[]{0,0};
	    }



	    public static void main(String[] args){

	        System.out.println("Enter the size of the Array");
	        Scanner sc = new Scanner(System.in) ;
	        int size = sc.nextInt() ;
	        int i = 0;
	        int arr[] = new int[size] ;
	        System.out.println("Enter the target Element") ;
	        int target = sc.nextInt() ;
	        while(i<size){
	            System.out.println("Enter the element : ") ;
	            arr[i] = sc.nextInt() ;
	            i++;
	        }
	        TwoSum s1 = new TwoSum() ;
	        System.out.println(Arrays.toString(s1.twoSum(arr,target))) ;
	    }
	}

