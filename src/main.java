public class main {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        insertionSort(array);

        System.out.println("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}