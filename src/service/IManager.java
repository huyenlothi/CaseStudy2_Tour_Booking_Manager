package service;

public interface IManager<T> {
    abstract void add(T o);
    abstract  void edit(int code);
    abstract  void remove(int code);
    abstract  void display();
}
