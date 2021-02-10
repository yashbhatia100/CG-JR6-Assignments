package flowcontrol;

public class Exercise6 {

	public static void main(String args[]) {
		Exercise6 app = new Exercise6();
		app.start();

	}

	void start() {
		int number = 10;
		int ans = calculateDifference(number);
		System.out.println(ans);

	}

	int calculateDifference(int n) {
		int sum, num, num1, num2;
		num = n;
		num1 = (num * (num + 1)) / 2;
		num2 = num * (num + 1) * (2 * num + 1) / 6;
		sum = num2 - (num1 * num1);
		return sum;
	}

}
