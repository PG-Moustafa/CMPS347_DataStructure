package dStructures_Lab1;

// Data Structures - Lab 1 - Ex 1
// Shayma Hicham Obeid
// Moustafa Haydar - 2024 03 077

public class Main {
	public static void main(String[] args) {
		ArrayInt array = new ArrayInt(10);

		array.InsertElementAtBack(5);
		array.InsertElementAtBack(3);
		array.InsertElementAtBack(8);
		array.InsertElementAtBack(12);
		array.InsertElementAtBack(9);
		array.InsertElementAtBack(6);

		System.out.println("Initial array:");
		array.Display();

		System.out.println("Insert element at front:");
		array.InsertElementAtFront(15);
		array.Display();

		System.out.println("Insert element at position 2:");
		array.InsertElementAtPosition(2, 10);
		array.Display();

		System.out.println("Searching for value 9:");
		int index = array.SearchValue(9);
		System.out.println("Found at index: " + index);

		System.out.println("Deleting element with value 8:");
		array.DeleteElement(8);
		array.Display();

		System.out.println("Average of even numbers:");
		System.out.println(array.AverageOfEvenNb());

		System.out.println("Multiples of even three:");
		array.MultiplesOfEvenThree();

		System.out.println("Occurrences of number 6:");
		System.out.println(array.OccurrenceNb(6));

		System.out.println("Is the array a palindrome?");
		System.out.println(array.Palindrome());

		System.out.println("Odd elements array:");
		int[] oddElements = array.OddElementArray();
		for (int odd : oddElements) {
			System.out.print(odd + " ");
		}
		System.out.println();

		System.out.println("Second maximum value:");
		System.out.println(array.FindSecondMaximum());

		System.out.println("Maximum value:");
		System.out.println(array.FindMaximum());

		System.out.println("Is the array even-dominant?");
		System.out.println(array.EvenOrOdd());

		System.out.println("Sorted array in descending order:");
		array.SortArrayDesc();
		array.Display();

		System.out.println("Deleting multiples of odd three:");
		array.DeleteMultipleOfOddThree();
		array.Display();
	}
}
