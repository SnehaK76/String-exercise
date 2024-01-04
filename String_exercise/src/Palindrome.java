
public class Palindrome {
	public static void main(String[] args) {
		
		String input = "MADAM";
		
		isPalindromeOrNot(input);
	}
	
	public static void isPalindromeOrNot(String input) {
		
		if(input.equals(reverse(input)))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
	
	public static String reverse(String input) {
		
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return new String(sb);
	}
}
