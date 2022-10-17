package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/14 19:13
 * @detail：客户端，将策略抽离客户端实现。修改策略具体实现或者新增策略时，不涉及客户端的修改。
 */
class Client {
    public static void main(String[] args) {
        Client client = new Client();
        int busPrice = client.setStrategy(new BusStrategy(),5);
        int taxiPrice = client.setStrategy(new TaxiStrategy(),5);

        System.out.println("公交车5km价格："+busPrice);
        System.out.println("出租车5km价格："+taxiPrice);
    }

    public int setStrategy(PriceStrategy priceStrategy,int distance){
        return priceStrategy.price(distance);
    }
}
