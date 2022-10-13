package org.iesfm;

public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void inc() {
        value++;
    }

    public synchronized void dec() {
        value--;
    }
}
