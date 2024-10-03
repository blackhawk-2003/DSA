import java.util.Scanner;

public class Selection_Sort {

    public static int[] Selection_Sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The sorted array is:- ");
        int[] sorted = Selection_Sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
