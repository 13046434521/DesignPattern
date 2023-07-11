package strategy.common;

/**
 * @author：TianLong
 * @date：2022/10/18 22:13
 * @detail：环境类
 */
class Context {
    private IStrategy mStrategy;

    public void setStrategy(IStrategy iStrategy) {
        mStrategy = iStrategy;
    }

    public int price(int distance) {
        return mStrategy.price(distance);
    }
}
