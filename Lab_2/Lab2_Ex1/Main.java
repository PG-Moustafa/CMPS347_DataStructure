package ArrayInt;

// Data Structures - Lab_2 - Ex_1
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077

public class Main {
    public static void main(String[] args) {

        ArrayInt arr = new ArrayInt(10);

        arr.InsertAtTop(3);
        arr.InsertAtTop(4);
        arr.InsertAtTop(5);
        arr.InsertAtTop(4);
        arr.InsertAtTop(4);

        arr.Display();

        arr.InsertElementAtStart(8);

        arr.Display();

        int e = arr.DeleteFromTop();
        System.out.println("Deleted element is " + e);

        arr.Display();

        arr.FindUniqueValues();

        // Reversed ArrayInt
        ArrayInt arr2 = arr.ReverseArray();
        arr2.Display();

        // Print Prime Elements
        arr.PrimeArray();

    }
}
