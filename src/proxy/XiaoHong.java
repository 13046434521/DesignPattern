package proxy;

/**
 * @author：TianLong
 * @date：2022/10/24 19:09
 * @detail：实际主题类,行为的真正是执行者
 */
class XiaoHong implements ILawyer{

    @Override
    public void submit() {
        System.out.println("小红提交诉讼");
    }

    @Override
    public void defend() {
        System.out.println("小红辩诉");
    }

    @Override
    public void finish() {
        System.out.println("小红案件结束");
    }
}
