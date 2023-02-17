package factory.abstraction.abstraction;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 19:14
 * Detail（详情）：BYD工厂，实际产品工厂
 */
public class BYDFactory implements IFactory{

    @Override
    public IEV creatEV() {
        return new HanEV();
    }

    @Override
    public IHEV creatHEV() {
        return new TangDMI();
    }
}
