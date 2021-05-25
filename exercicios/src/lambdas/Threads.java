package lambdas;

public class Threads {

	public static void main(String[] args) {

		Runnable t1 = new Trabalho1();
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa 2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
				}

			}
		};

		Runnable t3 = Threads::tr3;

		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		Thread tr3 = new Thread(t3);

		tr1.start();
		tr2.start();
		tr3.start();

	}

	static void tr3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa 3");
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}

}
