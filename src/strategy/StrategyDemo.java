package strategy;

/**
 * @author：TianLong
 * @date：2022/10/14 19:25
 * @detail：传统实现方式
 */
class StrategyDemo {
    private static final int BUS = 0;
    private static final int TAXI = 1;

    public static void main(String[] args) {
        StrategyDemo strategyDemo = new StrategyDemo();
        int busPrice = strategyDemo.price(BUS, 5);
        int taxiPrice = strategyDemo.price(TAXI, 5);

        System.out.println("公交车5km价格：" + busPrice);
        System.out.println("出租车5km价格：" + taxiPrice);
    }

    public int price(int type, int distance) {
        int price = 0;
        if (type == BUS) {
            price = 2 * distance;
        } else if (type == TAXI) {
            price = 5 * distance;
        } else {
            // 其他方式，此处省略...
        }

        return price;
    }
}
