public class ArrayCreator {
    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
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