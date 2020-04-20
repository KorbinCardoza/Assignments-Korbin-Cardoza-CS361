package wou.algo.demos;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	var deque = new Deque();
        IntStream.range(0,10).forEach(deque::pushLeft);

        for(var i =0; i < 10; ++i){
           System.out.println(deque.popLeft());
        }

    }
}
