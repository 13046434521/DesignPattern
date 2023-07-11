package observer.concrect;

/**
 * @author：TianLong
 * @date：2022/10/20 1:03
 * @detail：具体主题类，即真正的被观察者类
 */
class HJIMI<T extends Observer> extends Observable<T> {
    @Override
    public void notifyObserver() {
        for (T t : mArrayList) {
            t.takeMoney(t);
        }
    }
}
