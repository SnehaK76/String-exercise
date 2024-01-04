
public class ReplaceCharcter {
	public static void main(String[] args) {
		String str = "ABCDE";
		System.out.println("Original String : "+str);
		replaceCharacter(str);
	}
	
	public static void replaceCharacter(String input) {
		String newStr = input.replace('A', 'Z');
		
		System.out.println("Updated String : "+newStr);
	}
}
