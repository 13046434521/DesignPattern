package factory.methodfactory;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/8 14:24
 * Detail（详情）：工厂方法模式客户端
 */
public class Client {
    public static void main(String[] args) {
        BYDFactory bydFactory = new BYDFactory();
        bydFactory.buildCar().name();

        TSLAFactory tslaFactory = new TSLAFactory();
        tslaFactory.buildCar().name();
    }
}
