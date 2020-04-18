package wou.algo.Assignment.two;
//Will return the max sum
import java.util.Arrays;
public class MethodTester {

    public static int algorithmOne(final int[] array){
        var sum = 0;

        for (int i = 0; i < (array.length); i++) {
            var k = i;

        while (k < array.length){
            int value = 0;
            int[] arr = Arrays.copyOfRange(array, i, k);

            for (int j = 0; j < (arr.length - 1); ++j) {
                value += arr[j];
                if (value > sum) {
                    sum = value;

                }
            }
            ++k;
        }
        }
        return sum;
    }

    public static int algorithmTwo(final int[] array) {
        int sum = 0;
        for (int i = 0; i < (array.length); i++) {

            int value = 0;
            int[] arr = Arrays.copyOfRange(array, i, array.length + 1);
            for (int j = i; j < (arr.length - 1); ++j) {
                value += arr[j];
            }

            if (value > sum) {
                sum = value;
            }
        }

        return sum;
    }

    public static int algorithmThree(final int[] array) {

        int sum = 0;
        for (int i = 0; i < (array.length); ++i) {

            int value = 0;
            int[] arr = Arrays.copyOfRange(array, i, array.length + 1);
            for (int j = i; j < (arr.length - 1); ++j) {
                value += arr[j];
            }

            if (value < 0) {
                i = arr.length - 1;
            } else if (value > sum) {
                sum = value;
            }
        }
        return sum;

    }
}
