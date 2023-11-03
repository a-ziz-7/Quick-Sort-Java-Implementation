import java.util.Arrays;

public class mian {
    public static void main(String[] args) {
        int[] arr = generate(1000);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] A, int p, int r) {

        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }

    }

    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                swap(A, i, j);
                i += 1;
            }
        }
        swap(A, i, r);
        return i;
    }

    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public static int[] generate(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = (int) (Math.random() * 1000) + 1;
        }
        return arr;
    }
}
