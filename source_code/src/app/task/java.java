import java.util.Arrays;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of books in the current test case
            int[] arr = new int[n]; // Array to store reading times

            // Read the reading times of each book
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Sort the array of reading times in ascending order
            Arrays.sort(arr);

            int time1 = 0;
            int time2 = 0;

            // Assign books to Kotivalo and Justina in a way that minimizes total time
            for (int i = n - 1; i >= 0; i--) {
                if (time1 <= time2) {
                    time1 += arr[i];
                } else {
                    time2 += arr[i];
                }
            }

            // Calculate the maximum total time between Kotivalo and Justina
            System.out.println(time1+time2);
            int maxTotalTime = Math.max(time1, time2);

            // Print the result for the current test case
            System.out.println(maxTotalTime);
        }
    }
}
