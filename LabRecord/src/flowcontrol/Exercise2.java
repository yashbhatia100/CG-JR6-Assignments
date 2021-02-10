package flowcontrol;

public class Exercise2 {
	public static void main(String args[]) {
		Exercise2 app = new Exercise2();
		app.start();

	}

	void start() {
		String input = "Red";
		switch (input) {
		case "Red":
			System.out.print("Stop");
			break;
		case "Yellow":
			System.out.print("Ready");
			break;
		case "Green":
			System.out.print("Go");
		}
	}

}