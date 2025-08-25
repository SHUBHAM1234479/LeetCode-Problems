package LeetCode;

public class ReverseString {

	public void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}

	}

	public static void main(String args[]) {
		char s[] = { 'h', 'e', 'l', 'l', 'o' };
		ReverseString sol = new ReverseString();
		sol.reverseString(s);
	}
}
