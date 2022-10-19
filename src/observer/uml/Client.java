package observer.uml;

/**
 * @author：TianLong
 * @date：2022/10/20 0:49
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        ConcreteObserver concreteObserver3 = new ConcreteObserver();

        ConcreteSubject<ConcreteObserver> subject = new ConcreteSubject<>();

        subject.addObserver(concreteObserver1);
        subject.addObserver(concreteObserver2);
        subject.addObserver(concreteObserver3);

        subject.notifyObserver();
    }
}
