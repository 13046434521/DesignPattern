package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/14 19:13
 * @detail：客户端，将策略抽离客户端实现。修改策略具体实现或者新增策略时，不涉及客户端的修改。
 */
class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // 切换出行策略乘坐公交车
        context.setStrategy(new BusStrategy());
        int busPrice = context.price(5);
        System.out.println("公交车5km价格：" + busPrice);

        // 切换出行策略乘坐出租车
        context.setStrategy(new TaxiStrategy());
        int taxiPrice = context.price(5);
        System.out.println("出租车5km价格：" + taxiPrice);
    }
}
