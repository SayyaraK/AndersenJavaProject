public class ArrayBinarySwapper {
        public static void swapZerosAndOnes (int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = 1 - array[i];  // This works because 1-1=0 and 1-0=1
            }
        }
    }