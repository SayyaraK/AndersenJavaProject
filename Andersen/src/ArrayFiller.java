public class ArrayFiller {
    public static int[] createAndFillArray() {
        int[] numbers = new int[100];

        // Fill array with 1-100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
            // New line every 10 numbers for better readability
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}