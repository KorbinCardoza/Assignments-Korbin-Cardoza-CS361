package wou.algo.demos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListBag<Item> implements Ibag<Item>, Iterable<Item> {
    private final LinkedList<Item> bag = new LinkedList<>();
    private final Random random = new Random();


    @Override
    public void add(Item item) {
bag.add(item);
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public Item get() throws Exception {
       if(isEmpty()) throw new Exception("The bag is empty");
       var item = bag.get(random.nextInt(bag.size()));
       bag.remove(item);
       return item;
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public Iterator<Item> iterator() {
        return bag.iterator();
    }
}
