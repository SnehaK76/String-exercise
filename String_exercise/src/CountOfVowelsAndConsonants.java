
public class CountOfVowelsAndConsonants {
	public static void main(String[] args) {
		String str1 = "Ahginuvdmejc";
		
		countVowelAndConsonants(str1);
	}
	
	public static void countVowelAndConsonants(String input) {
		input = input.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0; i<input.length(); i++) {
			if((input.charAt(i) == 'a') || (input.charAt(i)== 'e') || (input.charAt(i)== 'i') || (input.charAt(i)== 'o') ||(input.charAt(i)== 'u')) {
				vowels ++;	
			}else {
				consonants ++;	
			}
		}
		
		System.out.println("Number of vowels is : "+vowels);
		System.out.println("Number of consonants is : "+consonants);
		}

}
