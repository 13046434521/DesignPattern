package factory.method.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/8 14:20
 * Detail（详情）：具体产品类----比亚迪电动车
 */
public class BYD implements ICar{
    @Override
    public void name() {
        System.out.println("比亚迪新能源电动车");
    }

    @Override
    public void price() {
        System.out.println("20W");
    }
}
