package wou.algo.demos;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        var bag = new RandomBag<Integer>();

        for(var i = 0; i < 10; ++i)
        {
            bag.add(i);
        }

        System.out.println("Your number is: " + bag.get());
        System.out.println("The current amount of objects in the bag is: " + bag.size());

    }}
