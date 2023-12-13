package Task7;
import java.util.Arrays;
public class ArrayForSort implements ISort {
    private int[] array;

    public ArrayForSort(int[] array) {
        this.array = array;
    }

    @Override
    public void SortAsc() {
        Arrays.sort(array);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(array);
        reverseArray();
    }

    private void reverseArray() {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public void printArray() {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


}
