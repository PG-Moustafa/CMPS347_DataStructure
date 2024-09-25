package ArrayInt2;

// Data Structures - Lab_2 - Ex_2
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077

// Build ArrayInt Class 
// FIFO - First In First Out
// the front will be deleted first

public class ArrayInt {
    private int[] a; // array
    private int size; // size of the array
    private int front; // beginning of the array
    private int rear; // end of the array

    public ArrayInt(int size) {
        this.size = size;
        a = new int[size];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return (rear == size);
    }

    public void insertElementAtTop(int value) {
        if (!isFull()) {
            a[rear++] = value;
            System.out.println("Element inserted successfully!");
        } else {
            System.out.println("Array is full! Cannot insert.");
        }
    }

    public void DeleteFromBottom() {
        if (!isEmpty()) {
            for (int i = front; i < rear - 1; i++) {
                a[i] = a[i + 1];
            }
            a[rear - 1] = 0; // clear the last element after shiftin
            rear--;
            System.out.println("Element deleted successfully!");
        } else {
            System.out.println("No element available!");
        }

    }

    public void Display() {
        System.out.println("------------------------");
        System.out.print("Elements of the array: ");
        for (int i = front; i < rear; i++) {
            System.out.print(a[i]);
            if (i != rear - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public int searchForElement(int value) {
        for (int i = front; i < rear; i++) {
            if (a[i] == value)
                return i;
        }
        return -1;
    }

    public void DeleteElement(int element) {
        int index = searchForElement(element);
        if (index != -1) {
            for (int i = index; i < rear - 1; i++) {
                a[i] = a[i + 1];
            }
            a[--rear] = 0; // clear the last element
            System.out.println("Element " + element + " deleted successfully!");
        } else {
            System.out.println("Element doesnt exist!");
        }
    }

    public int maxEven() {
        int max = Integer.MIN_VALUE;
        for (int i = front; i < rear; i++) {
            if ((a[i] % 2 == 0) && (a[i] > max))
                max = a[i];
        }
        // return -1 if no even number is found
        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public int[] getA() {
        return a;
    }

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

}
