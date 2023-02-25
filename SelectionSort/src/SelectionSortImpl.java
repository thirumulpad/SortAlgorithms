public class SelectionSortImpl {

    public int[] sort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
            }
            swap(array, largest, lastUnsortedIndex);
        }

        return array;
    }

    private void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
