import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(bubbleSortOptimal(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n - 1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortOptimal(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n - 1; i++) {
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if(!swapped) 
                break;
        }
        return arr;
    }
}
