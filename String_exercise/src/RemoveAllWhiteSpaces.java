
public class RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		
		String str = "Lap top";
		System.out.println("original string : " +str);
		String str2 = removeWhiteSpaces(str);
		System.out.println("Updated String : "+str2);
	}
	
	public static String removeWhiteSpaces(String input) {
		
		String newString = input.replace(" ", "");
		return newString;
	}
}
