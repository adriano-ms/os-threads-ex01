package view;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread() {
				@Override
				public void run() {
					System.out.println(this.getId());
				}
			};
			t.start();
		}
	}

}
