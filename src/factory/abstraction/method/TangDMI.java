package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 17:59
 * Detail（详情）：比亚迪唐DMI，混动车
 */
public class TangDMI implements ICar {
    @Override
    public void name() {
        System.out.println("比亚迪-唐DMI");
    }

    @Override
    public void price() {
        System.out.println("28.18w");
    }

    @Override
    public void kind() {
        System.out.println("混动汽车");
    }

    public void fuelConsumption(){
        System.out.println("油耗3.64L/100km");
    }
}
