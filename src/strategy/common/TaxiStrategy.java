package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/14 19:12
 * @detail：具体策略实现类
 */
class TaxiStrategy implements IStrategy {

    @Override
    public int price(int distance) {
        return distance * 5;
    }
}
