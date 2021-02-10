package flowcontrol;

public class Exercise8 {
	public static void main(String args[]) {
		Exercise8 app = new Exercise8();
		app.start();
	}

	void start() {
		int number = 1025;
		boolean flag = checkNumber(number);
		if (flag) {
			System.out.println("Is power of 2");

		} else {
			System.out.println("Not a power of 2");
		}
	}

	boolean checkNumber(int n) {
		boolean ispower = true;
		int num = n, i;
		if (num % 2 == 0) {
			ispower = true;
		} else {
			ispower = false;
		}
		return ispower;
	}

}
