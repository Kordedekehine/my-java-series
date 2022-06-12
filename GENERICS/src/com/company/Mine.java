package com.company;

public class Mine<T> {
    T collector;

    public Mine(T collector) {
        this.collector = collector;
    }

    public T getCollector() {
        return collector;
    }
}
