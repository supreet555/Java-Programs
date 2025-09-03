package wrapper_class;

public class CharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '1';
		System.out.println(
			Character.isUpperCase(ch) ? "uppercase" : "lowercase"
		);

	}

}

/*
 * USEFUL METHODS (static)
 * isDigit(char)
 * isAlphabet(char)
 * isLetterOrDigit(char)
 * isUpperCase(char)
 * isLowerCase(char)
 * getNumericValue(char) 
 * --- returns corresponding integer value between '0' and '9'
 * --- returns 10 to 35 between 'a' and 'z' OR 'A' and 'Z'
 * --- returns -1 for anythings else
 */

