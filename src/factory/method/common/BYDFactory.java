package factory.method.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/8 14:23
 * Detail（详情）：具体工厂类---比亚迪新能源工厂
 */
public class BYDFactory implements IFactory{
    @Override
    public ICar buildCar() {
        return new BYD();
    }
}
