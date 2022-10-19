package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:12
 * @detail：环境类，维护状态变化，对外提供功能
 */
class Context  {
    // 默认复制为未登录状态
    private IState mState = new UnLoginState();

    public void setState(IState state) {
        this.mState = state;
    }

    public void collection() {
        mState.favorite();
    }

    public void loginAccount() {
        mState.login();
    }
}
