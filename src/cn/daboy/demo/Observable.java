package cn.daboy.demo;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
