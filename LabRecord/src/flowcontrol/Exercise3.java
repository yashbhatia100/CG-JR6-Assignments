package flowcontrol;

public class Exercise3 {
	public static void main(String args[]) {
		Exercise3 app = new Exercise3();
		{
			app.start();
		}
	}

	void start() {
		int num = 4;
		int first = 1, second = 1;
		int sum = 0;
		for (int i = 3; i <= num; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		System.out.print(sum);
	}
}