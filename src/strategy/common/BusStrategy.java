package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/14 19:10
 * @detail：具体策略实现类
 */
class BusStrategy implements IStrategy {
    @Override
    public int price(int distance) {
        return distance * 2 ;
    }
}
