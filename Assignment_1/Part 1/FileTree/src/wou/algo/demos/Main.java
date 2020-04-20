package wou.algo.demos;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	var iterativeFileTreeLister = new IterativeFileTreeLister();
        iterativeFileTreeLister.list("C:\\users");
System.out.println("" );
        var recursiveFileTreeLister = new RecursiveFileTreeLister();
        recursiveFileTreeLister.list("C:\\users");
    }
}
