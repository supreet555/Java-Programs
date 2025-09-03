// print next alphabet of each alphabet

package projects;

public class NextAlphabet {

	public static void main(String[] args) {
		String str = "SUPREET";
		int nextAlphASCII;
		char nextAlphabet;
		String reversedStr = "";
		
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			nextAlphASCII = str.charAt(i) + 1;
			nextAlphabet = (char) nextAlphASCII;
			reversedStr += nextAlphabet;
		}
		
		System.out.println(reversedStr);

	}

}
