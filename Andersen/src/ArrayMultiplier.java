public class ArrayMultiplier {
    public static int[] processArray(int[] inputArray) {

        int[] result = inputArray.clone();

        for (int i = 0; i < result.length; i++) {
            if (result[i] < 6) {
                result[i] *= 2;
            }
        }

        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
