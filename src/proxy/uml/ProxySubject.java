package proxy.uml;

/**
 * @author：TianLong
 * @date：2022/10/24 18:18
 * @detail：RealSubject的代理类，所以要持有该对象或者该对象抽象的引用
 */
class ProxySubject implements Subject{
    private RealSubject mRealSubject;

    public void setRealSubject(RealSubject realSubject) {
        mRealSubject = realSubject;
    }

    @Override
    public void visit() {
        mRealSubject.visit();
    }
}
