public class Binary {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        System.out.println("Element not found in the array.");
    }
}
