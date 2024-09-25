package ArrayInt2;

// Data Structures - Lab_2 - Ex_2
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077

public class Main {
    public static void main(String[] args) {

        // Test Exercise 2
        ArrayInt arr = new ArrayInt(10);

        // Insert values
        arr.insertElementAtTop(2);
        arr.insertElementAtTop(3);
        arr.insertElementAtTop(4);
        arr.insertElementAtTop(5);
        arr.insertElementAtTop(6);
        arr.Display();

        // Delete element from bottom
        arr.DeleteFromBottom();
        arr.Display();

        // Return index of the element
        int element = 5;
        System.out.println(
                "Index of the element " + element + " is: " +
                        arr.searchForElement(element));

        // Delete element by value
        arr.DeleteElement(4);
        arr.Display();

        // print the maximum even of array
        System.out.println("The maximum even of array: " + arr.maxEven());
    }
}
