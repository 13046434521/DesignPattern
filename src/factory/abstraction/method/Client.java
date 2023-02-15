package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:26
 * Detail（详情）：客户端
 */
public class Client {
    public static void main(String[] args) {
        // 我要获取一辆汉EV
        IFactory hanEVFactory = new HanEVFactory();
        hanEVFactory.buildCar().detail();

        // 我要获取一辆唐DMI
        IFactory tangDMIFactory = new TangDMIFactory();
        tangDMIFactory.buildCar().detail();

        // 我要获取一辆卡罗拉
        IFactory corollaFactory = new CorollaFactory();
        corollaFactory.buildCar().detail();

        // 我要获取一辆BZ4X
        IFactory bz4XFactory = new BZ4XFactory();
        bz4XFactory.buildCar().detail();
    }
}
