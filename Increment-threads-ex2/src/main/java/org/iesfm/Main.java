package org.iesfm;

import org.iesfm.Tasks.DecTask;
import org.iesfm.Tasks.IncTask;

public class Main {
    public static void main(String[] args) {
        Counter c =new Counter(100);

        IncTask inc = new IncTask(c);
        Thread threadInc = new Thread(inc);
        threadInc.start();

        DecTask dec = new DecTask(c);
        Thread threadDec = new Thread(dec);
        threadDec.start();

        try {
            threadInc.join();
            threadDec.join();
        } catch (InterruptedException e) {

        }

        System.out.println(c.getValue());
    }
}
