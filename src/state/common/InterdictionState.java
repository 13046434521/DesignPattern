package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 21:16
 * @detail：具体实现类，封号状态
 */
class InterdictionState implements IState {
    @Override
    public void favorite() {
        System.out.println("账号被封,请先解封");
    }

    @Override
    public void login() {
        System.out.println("账号被封,请先解封");
    }
}
