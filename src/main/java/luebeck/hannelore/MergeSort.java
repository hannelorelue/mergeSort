package luebeck.hannelore;

public class MergeSort {

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];

        System.arraycopy(a, 0, left, 0, middle);

        if (n - middle >= 0) System.arraycopy(a, middle, right, 0, n - middle);

        mergeSort(left, middle);
        mergeSort(right, n - middle);

        merge(a, left, right, middle, n - middle);

    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[k] = l[i];
                k++;
                i++;
            }
            else {
                a[k] = r[j];
                k++;
                j++;
            }
        }
        while (i < left) {
            a[k] = l[i];
            k++;
            i++;
        }
        while (j < right) {
            a[k] = r[j];
            k++;
            j++;
        }
    }
}


