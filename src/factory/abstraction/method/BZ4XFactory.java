package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:23
 * Detail（详情）：BZ4X，具体工厂
 */
public class BZ4XFactory implements IFactory {
    @Override
    public ICar buildCar() {
        return new BZ4X();
    }
}
