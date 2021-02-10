package flowcontrol;

public class Exercise7 {

	public static void main(String args[]) {
		Exercise7 app = new Exercise7();
		app.start();
	}

	void start() {
		int n = 134468;
		boolean flag = true;

		flag = checkNumber(n);
		if (flag) {
			System.out.println("Is increasing number");
		} else {
			System.out.println("Not increeasing number");
		}

	}

	boolean checkNumber(int number) {
		int n = number, i;
		boolean isIncreasing = true;
		String num = String.valueOf(n);
		for (i = 0; i < num.length() - 1; i++) {
			if (num.charAt(i) < num.charAt(i + 1)) {
				isIncreasing = true;
			} else
				isIncreasing = false;
		}

		return isIncreasing;
	}
}