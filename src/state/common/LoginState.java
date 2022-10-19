package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:13
 * @detail：具体实现类，登录状态
 */
class LoginState implements IState {
    @Override
    public void favorite() {
        System.out.println("收藏商品成功");
    }

    @Override
    public void login() {
        System.out.println("账号已登录，无需再次登录");
    }
}
