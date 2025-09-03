package map;

public class GarbagePractice {
	public static void main(String[] args) {
		new GarbagePractice();
		new GarbagePractice();
		System.gc();
	}
	
	protected void finalize() {
		System.out.println("Object removed from the memory");
	}
}
