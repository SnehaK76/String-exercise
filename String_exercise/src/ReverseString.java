
public class ReverseString {
     
	public static void main(String[] args) {
		
		String input = "XYZ";
		
		String output = reverseGivenString(input);
		System.out.println(output);
		
		String newOutput = reverseUsingArray(input);
		System.out.println(newOutput);
		
	}
	
	
	public static String reverseGivenString(String string) {
		
		StringBuffer sb = new StringBuffer(string);
		
		sb.reverse();
		
		return new String(sb);
		}
	
	public static String reverseUsingArray(String string) {
		
		char[] data = string.toCharArray();
		char[] res = new char[data.length];
		int counter = 0;
		
		for(int i=data.length-1; i>=0; i--) {
			res[counter] = data[i];
			counter ++;
		}
		
		return new String(res);
	}

}
