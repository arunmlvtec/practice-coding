package main.exponent;

public class ArrayIndexMatchValue {

    public int indexEqualsValueSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] < mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
