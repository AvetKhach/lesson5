package lesson5;

public class Usage_Insertion {
    public static void main(String[] args) {
        InsertionSortAlgorithm helpers = new InsertionSortAlgorithm();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Generated Array: ");
        helpers.print(array);
        helpers.insertionSort(array);
        System.out.print("\nSorted Array :");
        helpers.print(array);
    }
}
