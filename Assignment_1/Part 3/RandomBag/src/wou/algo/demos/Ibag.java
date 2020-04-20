package wou.algo.demos;

import java.security.spec.ECField;

public interface Ibag<Item> {
    void add(Item item);
    boolean isEmpty();
    Item get() throws Exception;
    int size();
}
