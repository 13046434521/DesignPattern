package state.common;

/**
 * @author：TianLong
 * @date：2022/10/18 20:52
 * @detail：状态模式抽象类
 */
interface IState {
    public static final int UN_LOGIN_STATE = 0;
    public static final int LOGIN_STATE = 1;
    public static final int INTERDICTION_STATE = 2;

    void favorite();

    void login();
}
