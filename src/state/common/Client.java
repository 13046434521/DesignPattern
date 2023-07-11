package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:26
 * @detail：客户类
 */
class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.loginAccount();

        // 登录，改变状态
        context.setState(new LoginState());

        context.loginAccount();
        context.collection();
    }
}
