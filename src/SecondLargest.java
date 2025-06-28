import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        if (limit < 2) {
            System.out.println("Need at least two elements.");
            return;
        }

        int[] arr = new int[limit];
        System.out.println("Enter " + limit + " elements:");
        for (int i = 0; i < limit; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int largest = arr[limit - 1];
        int secondLargest = -1;

        for (int i = limit - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
