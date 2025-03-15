import java.util.Random;

public class InsertionSorting {
    
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];

        // Generate random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(15);
        }

        // Print unsorted array
        System.out.print("Unsorted: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        InsertionSort(numbers);

        // Print sorted array
        System.out.print("Sorted: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
