package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:13
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        Factory watchFactory = new WatchFactory();
        watchFactory.createApple().brand();
        watchFactory.createHW().brand();

        Factory phoneFactory = new PhoneFactory();
        phoneFactory.createApple().brand();
        phoneFactory.createHW().brand();

        Factory carFactory = new CarFactory();
        carFactory.createApple().brand();
        carFactory.createHW().brand();
    }
}
