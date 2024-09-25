package dStructures_Lab1;

// Data Structures - Lab 1 - Ex 2
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077

public class ArrayInt {
	private int[] a;
	private int currentNb;

	public ArrayInt(int size) {
		a = new int[size];
		currentNb = 0;
	}

	public boolean isEmpty() {
		return currentNb == 0;
	}

	public boolean isFull() {
		return currentNb == a.length;
	}

	public void InsertElementAtFront(int value) {
		InsertElementAtPosition(0, value);
	}

	public void InsertElementAtBack(int value) {
		if (isFull()) {
			System.out.println("Array is full!");
			return;
		}
		a[currentNb++] = value;
	}

	public void InsertElementAtPosition(int pos, int value) {
		if (isFull()) {
			System.out.println("Array is full!");
		}
		if (pos < 0 || pos > currentNb) {
			System.out.println("Invalid position!");
			return;
		}

		for (int i = currentNb; i > pos; i--) {
			a[i] = a[i - 1];
		}
		a[pos] = value;
		currentNb++;

	}

	public void Display() {
		if (isEmpty()) {
			System.out.println("Array is empty!");
			return;
		}

		System.out.print("Elements of the array: ");
		for (int i = 0; i < currentNb; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public int SearchValue(int value) {
		for (int i = 0; i < currentNb; i++) {
			if (a[i] == value)
				return i;
		}
		return -1;
	}

	public boolean DeleteElement(int value) {
		int index = SearchValue(value);
		if (index != -1) {
			for (int i = index; i < currentNb - 1; i++) {
				a[i] = a[i + 1];
			}
			currentNb--;
			return true;
		}
		return false;
	}

	public double AverageOfEvenNb() {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < currentNb; i++) {
			if (isEven(a[i])) {
				sum += a[i];
				count++;
			}
		}
		return count == 0 ? 0 : (double) sum / count;
	}

	public void MultiplesOfEvenThree() {
		for (int i = 0; i < currentNb; i++) {
			if (isEven(a[i]) && (a[i] % 3 == 0)) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	public boolean isEven(int n) {
		return (n % 2 == 0);
	}

	public boolean isOdd(int n) {
		return (n % 2 != 0);
	}

	public int OccurrenceNb(int n) {
		int count = 0;
		for (int i = 0; i < currentNb; i++) {
			if (a[i] == n)
				count++;
		}
		return count;
	}

	public boolean Palindrome() {
		for (int i = 0; i < (currentNb / 2); i++) {
			if (a[i] != a[currentNb - 1 - i])
				return false;
		}
		return true;
	}

	public int[] OddElementArray() {

		int count = 0;
		for (int i = 0; i < currentNb; i++) {
			if (isOdd(a[i]))
				count++;
		}
		int arr[] = new int[count];
		int index = 0;

		for (int i = 0; i < currentNb; i++) {
			if (isOdd(a[i])) {
				arr[index++] = a[i];
			}
		}
		return arr;
	}

	public int FindSecondMaximum() {
		if (a.length < 2)
			return -1;
		int max = FindMaximum();
		int secondMax = Integer.MIN_VALUE;
		;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] > secondMax) && (a[i] != max))
				secondMax = a[i];
		}
		return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
	}

	public int FindMaximum() {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public boolean EvenOrOdd() {
		return (OddElementArray().length < (currentNb / 2));
	}

	public void SortArrayDesc() {
		for (int i = 0; i < currentNb - 1; i++) {
			for (int j = 0; j < currentNb; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public boolean MultiplesOfOddThree(int n) {
		return (isOdd(n) && (n % 3 == 0));
	}

	public void DeleteMultipleOfOddThree() {
		for (int i = 0; i < currentNb; i++) {
			if (MultiplesOfOddThree(a[i])) {
				DeleteElement(a[i]);
				i--;
			}
		}
	}

}
