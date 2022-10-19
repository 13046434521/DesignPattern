package chain;

/**
 * @author：TianLong
 * @date：2022/10/19 20:16
 * @detail：抽象处理者
 */
abstract class Handler {
    public Handler nextHandler;

    public abstract void handle(int money);
}
