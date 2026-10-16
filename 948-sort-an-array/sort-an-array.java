class Solution {
    public int[] sortArray(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        return mergesort(arr, 0, arr.length - 1);

    }

    static int[] mergesort(int arr[], int s, int e) {
        if (s == e) {
            return new int[] { arr[s] };
        }
        int mid = s + (e - s) / 2;
        int left[] = mergesort(arr, s, mid);
        int right[] = mergesort(arr, mid + 1, e);
        int final1[] = fun(left, right);
        return final1;
    }

    static int[] fun(int[] arr, int b[]) {
        int i = 0, j = 0, k = 0;
        int n = arr.length;
        int m = b.length;
        int c[] = new int[n + m];
        while (i < n && j < m) {
            if (arr[i] < b[j]) {
                c[k++] = arr[i];
                i++;
            } else {
                c[k++] = b[j];
                j++;
            }
        }
        while (i < n) {
            c[k++] = arr[i];
            i++;
        }
        while (j < m) {
            c[k++] = b[j];
            j++;
        }
        return c;

    }
}
