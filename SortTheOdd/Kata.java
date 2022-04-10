import java.util.Arrays;
public class Kata {
  public static int[] sortArray(int[] array) {
    int leftPosition = 0, rightPosition = array.length - 1;

        while (leftPosition < array.length - 1) {
            if (array[leftPosition] % 2 == 1) {
                while (rightPosition > leftPosition) {
                    if (array[rightPosition] % 2 == 1 && array[rightPosition] < array[leftPosition])
                        array[leftPosition] = array[leftPosition] ^ array[rightPosition] ^ (array[rightPosition] = array[leftPosition]);
                    --rightPosition;
                }
                rightPosition = array.length - 1;
            }
            ++leftPosition;
        }
        return array;
  }
}
