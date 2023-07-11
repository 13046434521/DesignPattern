package observer.uml;

/**
 * @author：TianLong
 * @date：2022/10/20 0:37
 * @detail：具体主题类
 */
class ConcreteSubject<T extends Observer> extends Subject<T> {
    @Override
    public void notifyObserver() {
        for (T t : mArrayList) {
            t.update(t);
        }
    }
}
