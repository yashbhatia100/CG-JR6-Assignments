package flowcontrol;

public class Exercise4 {
	public static void main(String args[]) {
		Exercise4 app = new Exercise4();
		app.start();
	}

	void start() {
		int num = 4;
		int result = fibonacciRecursive(num);
		System.out.println("result");
	}

	int fibonacciRecursive(int num) {
		int sum=0;
		if (num == 1 || num == 2) {
			return 1;
		} else {
			sum = sum + fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
			return sum;
		}

	}
}
