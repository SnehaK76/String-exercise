import java.util.Arrays;

public class AnagramsString {
	public static void main(String[] args) {
		String str1 = "HEART";
		String str2 = "EARTH";
		
		isAnagrams(str1, str2);
	}
	
	public static void isAnagrams(String input1 , String input2) {
		
		boolean status = false;
		
		if(input1.length() != input2.length()) {
			status = false;
		}else {
			char[] newStr1 = input1.toCharArray();
			char[] newStr2 = input2.toCharArray();
			
			Arrays.sort(newStr1);
			Arrays.sort(newStr2);
			
			String oneStr = new String(newStr1);
			String twoStr = new String(newStr2);
			
			status = oneStr.equals(twoStr);
		}
		if(status) {
			System.out.println("Strings are Angarams");
		}else {
			System.out.println("Strings are not Angarams");
			
		}
		
		
	};
}
