package threaaad;
public class Main implements Runnable {
	public static int count;

	public static void main(String[] args) throws InterruptedException {
		Main obj = new Main();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
		while (true) {
			System.out.println("Main Thread");
			System.out.println(count);
			Thread.sleep(5000);

		}
	}
	public void run() {

		while (true) {
			count += 1;
			//System.out.println("This code is running in a thread");
			//System.out.println(count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}