package threads;

public class MultiThread {

	public static void main(String[] args) {
		ModifiedClass m = new ModifiedClass();
		m.start();
		
		for(int b=4; b<=6; b++) {
			System.out.println(b);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
