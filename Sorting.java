import java.util.Arrays;

public class Sorting {

    
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int l = 0;
        int h = arr.length - 1;

    
        while (l < h) {
            swap(arr, l, h);
            l++;
            h--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
