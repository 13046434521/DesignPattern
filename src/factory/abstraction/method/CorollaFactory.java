package factory.abstraction.method;


/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:19
 * Detail（详情）：丰田卡罗拉，具体工厂
 */
public class CorollaFactory implements IFactory {
    @Override
    public ICar buildCar() {
        return new CorollaHybrid();
    }
}
