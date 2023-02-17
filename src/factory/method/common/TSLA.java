package factory.method.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/8 14:21
 * Detail（详情）：具体产品类---特斯拉电动车
 */
public class TSLA implements ICar{
    @Override
    public void name() {
        System.out.println("特斯拉新能源电动车");
    }

    @Override
    public void price() {
        System.out.println("28W");
    }
}
