public class InsertionSort {
    // Your custom sorting algorithm (Insertion Sort)
    public static void CustomSort(int[] A) {
        int n = A.length; // Get the length of the array to be sorted
        for (int i = 1; i < n; i++) {
            int currentElement = A[i]; // Store the current element to be inserted
            int j = i - 1; // Initialize a pointer to the last index of the sorted part
            // Shift elements greater than currentElement to the right
            while (j >= 0 && A[j] > currentElement) {
                A[j + 1] = A[j]; // Shift the element to the right
                j--; // Move the pointer to the left
            }

            // Place currentElement in its correct position
            A[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        // Test array
        int[] arr1 = {1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6};

        System.out.println("Before Sorting: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Call custom sorting algorithm (Insertion Sort)
        CustomSort(arr1);

        System.out.println("After Sorting: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
