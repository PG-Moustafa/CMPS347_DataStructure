package ArrayInt;

// Data Structures - Lab_2 - Ex_1
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077

public class ArrayInt {
    private int[] a; // array
    private int top; // top element index
    private int size; // size of the array

    public ArrayInt(int size) {
        this.size = size;
        a = new int[size];
        top = -1; // initialize top to -1 // array is Empty
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void InsertAtTop(int value) {
        if (!isFull()) {
            a[++top] = value;
            System.out.println("Element inserted successfully!");
        } else {
            System.out.println("Array is full! Cannot insert.");
        }
    }

    public void InsertElementAtStart(int value) {
        if (!isFull()) {
            for (int i = top; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = value;
            top++;
            System.out.println("Element inserted at the start successfully!");
        } else {
            System.out.println("Array is full! Cannot insert at the start.");
        }
    }

    public int DeleteFromTop() {
        int element = -1;
        if (!isEmpty()) {
            element = a[top];
            a[top--] = 0;
            System.out.println("Element deleted successfully!");
        } else {
            System.out.println("Array is empty! Cannot delete.");
        }

        return element;
    }

    public void Display() {
        System.out.print("Elements of the array: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
    }

    public int checkCount(int value) {
        int count = 0;
        for (int i = 0; i <= top; i++) {
            if (a[i] == value)
                count++;
        }
        return count;
    }

    public void FindUniqueValues() {
        System.out.print("Unique values: ");
        for (int i = 0; i <= top; i++) {
            if (checkCount(a[i]) == 1) {
                System.out.print(a[i]);
            }
            if (i != top) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public ArrayInt ReverseArray() {
        ArrayInt newArr = new ArrayInt(a.length);
        for (int i = top; i >= 0; i--) {
            newArr.InsertAtTop(a[i]);
        }
        return newArr;
    }

    public boolean CheckPrime(int value) {
        if (value <= 1)
            return false;
        if (value == 2 || value == 3)
            return true;
        if (value % 2 == 0 || value % 3 == 0)
            return false;
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public void PrimeArray() {
        System.out.print("Prime elements: ");
        for (int i = 0; i <= top; i++) {
            if (CheckPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

}
