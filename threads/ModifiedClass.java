package threads;

public class ModifiedClass extends Thread {

	public void run() {
		for(int a=0; a<3; a++) {
			System.out.println(a);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("An exception");
			}
		}
	}

}
