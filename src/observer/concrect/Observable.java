package observer.concrect;

import java.util.ArrayList;

/**
 * @author：TianLong
 * @date：2022/10/20 0:59
 * @detail：抽象主题类，即被观察者类
 */
abstract class Observable<T extends Observer> {
    protected ArrayList<T> mArrayList = new ArrayList<>();

    public void addObserver(T t) {
        mArrayList.add(t);
    }

    public abstract void notifyObserver();
}
