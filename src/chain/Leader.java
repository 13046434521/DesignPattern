package chain;

/**
 * @author：TianLong
 * @date：2022/10/19 20:22
 * @detail：具体实现处理者，部门组长
 */
class Leader extends Handler{
    private int limit = 1000;
    @Override
    public void handle(int money) {
        if (money<=limit){
            System.out.println("Leader 可以给你涨："+money);
            return;
        }else{
            if (nextHandler==null){
                System.out.println("nextHandler is null");
                return;
            }else{
                nextHandler.handle(money);
            }
        }
    }
}
