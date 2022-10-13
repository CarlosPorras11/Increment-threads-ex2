package org.iesfm.Tasks;

import org.iesfm.Counter;

public class DecTask implements Runnable {
    private Counter counter;

    public DecTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() > 0) {

            counter.dec();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
