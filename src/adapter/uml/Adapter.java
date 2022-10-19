package adapter.uml;

/**
 * @author：TianLong
 * @date：2022/10/19 17:05
 * @detail：适配类
 */
class Adapter implements ITarget{
    private Adaptee mAdaptee;
    public void setAdapter(Adaptee adaptee){
        mAdaptee = adaptee;
    }

    @Override
    public void operation() {
        // 将被适配者的operationA操作,改变成了目标需要的operation方法
        mAdaptee.operationA();
    }
}
