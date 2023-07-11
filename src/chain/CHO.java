package chain;

/**
 * @author：TianLong
 * @date：2022/10/19 20:27
 * @detail：具体实现者类，人事总监
 */
class CHO extends Handler {
    private int limit = 5000;

    @Override
    public void handle(int money) {
        if (money <= limit) {
            System.out.println("CHO 可以涨：" + money);
        } else {
            if (nextHandler == null) {
                System.out.println("nextHandler is null");
            } else {
                nextHandler.handle(money);
            }
        }
    }
}
