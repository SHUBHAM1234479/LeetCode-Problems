package LeetCode;

import java.util.Scanner;

public class Palindrome  {
    public boolean isPalindrome(int x) {
        int rev = 0;
        for(int i = x;i>0;i/=10)
        {
            rev= (rev*10)+ i%10;
        }
        System.out.println(rev) ;
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String args[]){

        Palindrome s = new Palindrome();
        System.out.println("Enter no To Check Palindrome") ;
        int num = new Scanner(System.in).nextInt() ;

        System.out.println(s.isPalindrome(num)) ;
    }
}