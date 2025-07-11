package Generics;

public class GenericContainer<T> implements Container<T>{

    private T item;
    @Override
    public void add(T items) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
