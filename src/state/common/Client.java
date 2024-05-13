package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:26
 * @detail：客户类
 */
class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 账号未登录
        context.loginAccount();

        // 登录，改变状态
        context.setState(new LoginState());

        context.loginAccount();
        context.collection();

        // 账号被封
        context.setState(new InterdictionState());
        context.loginAccount();
        context.collection();
    }
}
