package observer.uml;

import java.util.ArrayList;

/**
 * @author：TianLong
 * @date：2022/10/20 0:37
 * @detail：抽象主题类
 */
abstract class Subject<T extends Observer> {
    protected ArrayList<T> mArrayList = new ArrayList();

    public void addObserver(T observer){
        mArrayList.add(observer);
    }

    public abstract void notifyObserver();
}
