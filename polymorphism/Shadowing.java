package polymorphism;

public class Shadowing {
	
	public static void main(String[] args) {

		ParentHelper h = new Helper();
		System.out.println(h.a);

	}
}
