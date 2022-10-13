package org.iesfm.Tasks;

import org.iesfm.Counter;

public class IncTask implements Runnable {

    private Counter counter;

    public IncTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() != 0) {

            counter.inc();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
