package observer.concrect;

/**
 * @author：TianLong
 * @date：2022/10/20 1:08
 * @detail：客户类
 */
class Client {
    public static void main(String[] args) {
        // 欠薪公司
        HJIMI<Observer> hjimi = new HJIMI<>();

        // 欠薪员工
        MrJia jia = new MrJia();
        MrsCheng cheng = new MrsCheng();
        MrsHao hao = new MrsHao();

        // 通过劳动监察，公司终于答应，有钱就告诉我们
        hjimi.addObserver(jia);
        hjimi.addObserver(cheng);
        hjimi.addObserver(hao);

        // 过了很久很久，公司破产的前夕
        hjimi.notifyObserver();
    }
}
