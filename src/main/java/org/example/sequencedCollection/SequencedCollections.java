package org.example.sequencedCollection;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedCollections {

    public static void executeSequencedCollections() {
        SequencedMap<String, Integer> sequencedCollection = new LinkedHashMap<>();
        sequencedCollection.put("one", 1);
        sequencedCollection.put("two", 2);
        sequencedCollection.put("three", 3);
        System.out.println(sequencedCollection.firstEntry());
        System.out.println(sequencedCollection.lastEntry());
        System.out.println(sequencedCollection.reversed());
        sequencedCollection.putFirst("zero", 0);
    }

    public static void main(String[] args) {
        executeSequencedCollections();
    }


}
