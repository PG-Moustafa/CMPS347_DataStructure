
// Data Structures - Lab_3 - Ex_1
// Shayma Hicham Obeid
// Moustafa Haydar - 202403077
// 23/9/2024

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

    public void SortArrayDesc() {
        // by using Selection Algorithm
        for (int i = 0; i < currentNb - 1; i++) {
            for (int j = i + 1; j < currentNb; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void SortArrayAscending() {
        // by using Selection Algorithm
        for (int i = 0; i < currentNb - 1; i++) {
            for (int j = i + 1; j < currentNb; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void SelectionSort() {
        // by using Selection Algorithm
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

    public Boolean InterpolationSearch(int value) {
        int low = 0;
        int high = currentNb - 1;

        while (low <= high && value >= a[low] && value <= a[high]) {
            int key = low + (high - low) * (value - a[low]) / (a[high] - a[low]);

            // Check for division by zero
            if (a[high] - a[low] == 0) {
                return false; // Element not found
            }

            if (a[key] == value) {
                return true;
            } else if (a[key] < value) {
                low = key + 1;
            } else {
                high = key - 1;
            }
        }

        return false;
    }

    public int IntervalBinarySearch(int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + high / 2; // calculate mid
            if (a[mid] == value)
                return mid; // value found
            else if (a[mid] < value)
                low = mid + 1; // value > a[mid]
            else
                high = mid - 1;
        }

        return -1;
    }

}