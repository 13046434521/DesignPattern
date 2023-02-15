package factory.abstraction.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:08
 * Detail（详情）：丰田卡罗拉双擎，混动车
 */
public class CorollaHybrid implements IHEV {
    @Override
    public void name() {
        System.out.println("丰田-卡罗拉双擎");
    }

    @Override
    public void price() {
        System.out.println("13.98w");
    }

    @Override
    public void kind() {
        System.out.println("混动汽车");
    }

    public void fuelConsumption(){
        System.out.println("油耗4.2L/100km");
    }
}
