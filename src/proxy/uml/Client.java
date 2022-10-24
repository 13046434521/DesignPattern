package proxy.uml;



/**
 * @author：TianLong
 * @date：2022/10/24 18:22
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.setRealSubject(realSubject);
        proxySubject.visit();
    }
}
