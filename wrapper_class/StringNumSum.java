package wrapper_class;

public class StringNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde12345!@#R$%^";
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				System.out.println(s.charAt(i));
				
				sum = sum + Character.getNumericValue(s.charAt(i));
			}
		}
		
		System.out.println(sum);
	}

}
