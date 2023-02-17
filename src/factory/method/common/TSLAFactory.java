package factory.method.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/8 14:24
 * Detail（详情）：具体工厂类---特斯拉上海工厂
 */
public class TSLAFactory implements IFactory{
    @Override
    public ICar buildCar() {
        return new TSLA();
    }
}
