package org.example.virtualThreads;

import java.util.concurrent.atomic.AtomicLong;

public class ScaleDefaultThread {
    private static final int NUMBER_OF_VIRTUAL_THREADS = 100_000_000;
    private static final int PRINT_STEP = Math.min(NUMBER_OF_VIRTUAL_THREADS / 10, 100_000);

    public static void main(String[] args) {
        AtomicLong counter = new AtomicLong(0);
        for (int i = 0; i < NUMBER_OF_VIRTUAL_THREADS; i++) {
            new Thread(counter::incrementAndGet).start();
            if (i % PRINT_STEP == 0) {
                System.out.println("Running threads: " + counter.get());

            }


        }

    }
}