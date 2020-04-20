package wou.algo.demos;

import java.io.File;
import java.io.IOException;

public class IterativeFileTreeLister implements IFileTreeLister{
    @Override
    public void list(String path) throws IOException {

        new File(path).isDirectory();
        var directoryContents = new File(path).listFiles();

        for(var file : directoryContents){
            System.out.println("File: " + file);
        }
    }
}
