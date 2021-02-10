package flowcontrol;

public class Exercise5 {

	public static void main(String args[]) {
		Exercise5 app = new Exercise5();
		app.start();

	}

	void start() {
		int num = 5;
		int ans = calculateSum(num);
		System.out.println(ans);

	}

	int calculateSum(int n) {
		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
