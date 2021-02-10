package arrays;

public class SecondLargest {
	public static void main(String args[]) {
		SecondLargest app = new SecondLargest();
		app.start();
	}

	void start() {
		int arr[] = { 2, 4, 1, 3, 5 };
		int result = getSecondSmallest(arr);
		System.out.println(result);

	}

	int getSecondSmallest(int array[]) {
		int temp, i, j;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++)
				if (array[i] > array[j])

				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}

		return array[1];

	}

}
