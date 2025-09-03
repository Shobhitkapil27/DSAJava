package DesignPattern.IteratorPattern;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
