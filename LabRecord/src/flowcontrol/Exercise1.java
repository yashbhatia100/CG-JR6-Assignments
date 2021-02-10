package flowcontrol;

public class Exercise1 {
	public static void main(String args[]) {
		Exercise1 app = new Exercise1();
		app.start();

	}

	void start() {
		int number1 = 15;
		int result = cubesSum(number1);
		System.out.println(result);
	}

	int cubesSum(int num) {
		int sum = 0, num1;
		while (num > 0) {
			num1 = num % 10;
			sum = sum + (num1 * num1 * num1);

			num = num / 10;
		}
		return sum;
	}
}
