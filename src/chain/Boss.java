package chain;

/**
 * @author：TianLong
 * @date：2022/10/19 20:25
 * @detail：具体实现处理者，公司老板
 */
class Boss extends Handler{
    private int limit = 10000;
    @Override
    public void handle(int money) {
        if (money<=limit){
            System.out.println("Boss 可以涨："+money);
            return;
        }else{
            System.out.println("Boss不能给你涨，你的需求"+money+"太高了");
        }
    }
}
