
// Data Structures - Lab_3 - Ex_1
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077
// 23/9/2024

public class App {
    public static void main(String[] args) {
        // Create an array of size 10
        ArrayInt array = new ArrayInt(10);

        // Test InsertElementAtBack
        array.InsertElementAtBack(10);
        array.InsertElementAtBack(20);
        array.InsertElementAtBack(30);
        array.InsertElementAtBack(40);
        array.Display(); // Should display: 10 20 30 40

        // Test InsertElementAtFront
        array.InsertElementAtFront(5);
        array.Display(); // Should display: 5 10 20 30 40

        // Test InsertElementAtPosition
        array.InsertElementAtPosition(2, 15);
        array.Display(); // Should display: 5 10 15 20 30 40

        // Test SearchValue
        int searchResult = array.SearchValue(20);
        System.out.println("Position of 20: " + searchResult); // Should display position of 20

        // Test DeleteElement
        boolean deleteResult = array.DeleteElement(15);
        if (deleteResult) {
            System.out.println("Element 15 deleted");
        } else {
            System.out.println("Element 15 not found");
        }
        array.Display(); // Should display: 5 10 20 30 40

        // Test SortArrayDesc
        array.SortArrayDesc();
        System.out.println("Sorted Array (Descending): ");
        array.Display(); // Should display in descending order: 40 30 20 10 5

        // Test SortArrayAscending
        array.SortArrayAscending();
        System.out.println("Sorted Array (Ascending): ");
        array.Display(); // Should display in ascending order: 5 10 20 30 40

        // Test InterpolationSearch
        boolean isFound = array.InterpolationSearch(20);
        System.out.println("Is 20 found with Interpolation Search? " + isFound); // Should be true

        // Test IntervalBinarySearch
        int binarySearchResult = array.IntervalBinarySearch(30);
        System.out.println("Position of 30 with Binary Search: " + binarySearchResult); // Should display position of 30

        // Test with a full array
        array.InsertElementAtBack(50);
        array.InsertElementAtBack(60);
        array.InsertElementAtBack(70);
        array.InsertElementAtBack(80);
        array.InsertElementAtBack(90); // Now array is full
        array.Display();
        array.InsertElementAtBack(100); // Should display "Array is full!"
    }
}
