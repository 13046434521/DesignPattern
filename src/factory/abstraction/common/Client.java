package factory.abstraction.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:26
 * Detail（详情）：客户端
 */
public class Client {
    public static void main(String[] args) {
        // 获取BYD工厂联系方式
        IFactory bydFactory = new BYDFactory();
        // BYD工厂生产电动车-汉EV
        bydFactory.creatEV().detail();
        // BYD工厂生产混动车-唐DMI
        bydFactory.creatHEV().detail();

        // 获取丰田工厂联系方式
        IFactory toyotaFactory = new ToyotaFactory();
        // 丰田工厂生产电动车-BZ4X
        toyotaFactory.creatEV().detail();
        // 丰田工厂生产混动车-卡罗拉双擎
        toyotaFactory.creatHEV().detail();
    }
}
