package LeetCode;

import java.util.Scanner;

public class LongestSubstring {

	public String substring(String s) {

		if (s.length() == 1)
			return s;
		
		String LPS ="";
		for (int i = 1; i < s.length(); i++) {
			int left = i;
			int right = i;
			
			while (s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
				if(left==-1 || right==s.length())
					break;
				
			}
			
			String palindrome=s.substring(left+1,right) ;
			
			
			if(palindrome.length() > LPS.length())
				LPS = palindrome;
			
			left = i-1;
			right = i;
			while(s.charAt(left)==s.charAt(right))
			{
				left--;
				right++;
				if(left==-1 || right==s.length())
					break;
			}
			
			palindrome = s.substring(left+1,right) ;
			
			if(palindrome.length()>LPS.length())
				LPS = palindrome ;
			
			

		}
		return LPS;

	}

	public static void main(String[] args) {

		System.out.println("Enter the string");
		String s = new Scanner(System.in).next();

		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.substring(s));

	}

}
