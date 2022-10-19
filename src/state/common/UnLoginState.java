package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:14
 * @detail：具体实现类，未登录状态
 */
class UnLoginState implements IState {

    @Override
    public void favorite() {
        System.out.println("账号尚未登录，请先登录");
    }

    @Override
    public void login() {
        System.out.println("账号尚未登录，请先登录");
    }
}
