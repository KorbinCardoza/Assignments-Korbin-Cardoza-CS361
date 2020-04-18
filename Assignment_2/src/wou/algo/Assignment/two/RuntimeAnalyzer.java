package wou.algo.Assignment.two;
//Will return the number of assignment operators

import java.util.Arrays;

public class RuntimeAnalyzer {

    public static int algorithmOne(final int[] array){
        var sum = 0;
        var count = 0;

        for (int i = 0; i < (array.length); i++) {
            var k = i;
            ++count;

            while (k < array.length){
                int value = 0;
                ++count;
                int[] arr = Arrays.copyOfRange(array, i, k);
                ++count;

                for (int j = 0; j < (arr.length - 1); ++j) {
                    value += arr[j];
                    if (value > sum) {
                        sum = value;
                        ++count;

                    }
                }
                ++k;
            }
        }

        return count;
    }

    public static int algorithmTwo(final int[] array) {
        int sum = 0;
        var count = 0;

        for (int i = 0; i < (array.length); i++) {

            int value = 0;
            ++count;
            int[] arr = Arrays.copyOfRange(array, i, array.length + 1);
            ++count;
            for (int j = i; j < (arr.length - 1); ++j) {
                value += arr[j];
            }

            if (value > sum) {
                sum = value;
                ++count;
            }
        }

        return count;
    }

    public static int algorithmThree(final int[] array) {
        var count = 0;
        int sum = 0;
        for (int i = 0; i < (array.length); ++i) {

            int value = 0;
            ++count;

            int[] arr = Arrays.copyOfRange(array, i, array.length + 1);
            for (int j = i; j < (arr.length - 1); ++j) {
                value += arr[j];
            }

            if (value < 0) {
                i = arr.length - 1;
                ++count;
            } else if (value > sum) {
                sum = value;
                ++count;
            }
        }
        return count;

    }
}

