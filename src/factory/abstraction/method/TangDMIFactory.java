package factory.abstraction.method;


/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:19
 * Detail（详情）：唐DMI，具体工厂
 */
public class TangDMIFactory implements IFactory {
    @Override
    public ICar buildCar() {
        return new TangDMI();
    }
}
