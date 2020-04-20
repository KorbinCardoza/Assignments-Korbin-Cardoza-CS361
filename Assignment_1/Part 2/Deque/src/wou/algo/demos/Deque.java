package wou.algo.demos;

import java.util.LinkedList;

public class Deque<Item> implements IDeque<Item> {
    private final LinkedList<Item> deque = new LinkedList<>();


    @Override
    public boolean isEmpty() {
       return deque.isEmpty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void pushLeft(Item item) {
        deque.addFirst(item);
    }


    @Override
    public void pushRight(Item item) {
        deque.addLast(item);
    }

    @Override
    public Item popLeft() {
        var temp = deque.peekFirst();
        deque.removeFirst();
return temp;
    }

    @Override
    public Item popRight() {

        var temp = deque.peekLast();
        deque.removeLast();
        return temp;
    }
}
