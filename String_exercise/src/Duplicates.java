
public class Duplicates {
	public static void main(String[] args) {
		String str = "AABCB";
		removeDuplicates(str);
	}

	public static void removeDuplicates(String str) {
		char[] string1 = str.toCharArray();

		for(int i=0; i<string1.length; i++) {
			for(int j=i+1; j<string1.length; j++) {
				if(string1[i] == string1[j]) {
					string1[j] = ' ';
				}
			}
		}
		
		String res = new String(string1);
		String newResult = res.replaceAll(" ", "");
		System.out.println("Updated String is : "+newResult);
	}
}
