package test;

public abstract class Base<T> {
    protected T instance;

    protected Base(T values) {
        instance = values;
    }
}
