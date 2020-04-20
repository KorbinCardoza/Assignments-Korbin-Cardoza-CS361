package wou.algo.demos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import static java.lang.Math.random;

public class RandomBag<Item> implements Ibag<Item>, Iterable<Item> {
    private int maxSize = 10;
    private int currentIndex = 0;
   private Item[] bag =  (Item[]) new Object[maxSize];

    @Override
    public void add(Item item) {
//if (not full) bag[currentIndex] = item
        // else grow the array to 2 x maxsize

        bag[currentIndex] = item;
        currentIndex++;
        maxSize = (2 * maxSize);
    }

    @Override
    public boolean isEmpty() {

        return bag.length == 0;
    }

    @Override
    public Item get() throws Exception {
        if(isEmpty()) {
            throw new Exception("The bag is empty");
        }

        else{
   //Create a random number
            Random random = new Random();
            var rnd = random.nextInt(10);
   //
            var temp = bag[rnd];
           bag[rnd] = null;
           currentIndex--;
           return temp;
        }
       // var item = bag.get(random.nextInt(bag.size()));
       // bag.remove(item);

    }

    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public Iterator<Item> iterator() {
        // 1. randomize the bag
        // 2. Return an iterator to the bag
        // Done
        var list = Arrays.asList(bag);
        Collections.shuffle(list);
        return list.iterator();
    }
}
