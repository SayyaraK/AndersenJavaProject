public class ArrayShifter {
    public static void cyclicShift(int[] array, int n) {
        if (array.length == 0) return;

        n = n % array.length;
        if (n < 0) {
            n += array.length;
        }

        for (int i = 0; i < n; i++) {
            shiftRightByOne(array);
        }
    }

    private static void shiftRightByOne(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
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