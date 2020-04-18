package wou.algo.Assignment.two;

public class Main {

    public static int[] arrayFactory(final int n) {
        var array = new int[n];
        int x = -10, y = 99;

        for(var i = 0; i < n; ++i)
            array[i] = (int)(Math.random()*(y - x + 1) + x);

        return array;
    }

    private static double averageAlgoOne(final int n){
        var runs = 2000;
       int sum = 0;

       for(var i = 0; i < runs; ++i){
           sum += RuntimeAnalyzer.algorithmOne(arrayFactory(n));
        }
        return sum / runs;
    }
    private static double averageAlgoTwo(final int n){
        var runs = 2000;
        int sum = 0;

        for(var i = 0; i < runs; ++i){
            sum += RuntimeAnalyzer.algorithmTwo(arrayFactory(n));
        }
        return sum / runs;
    }
    private static double averageAlgoThree(final int n){
        var runs = 2000;
       var sum = 0.0;

        for(var i = 0; i < runs; ++i){
            sum += RuntimeAnalyzer.algorithmThree(arrayFactory(n));
        }
      return sum / runs;
    }


    public static void main(String[] args){

        for(var n = 5; n <= 50; n += 5){
            System.out.println("Array Size: " + n);
            System.out.println(averageAlgoOne(n));
            System.out.println(averageAlgoTwo(n));
           System.out.println(averageAlgoThree(n));

        }
    }


}
