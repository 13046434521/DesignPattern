package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/14 19:07
 * @detail：抽象策略类
 */
interface PriceStrategy {
    int price(int distance);
}
