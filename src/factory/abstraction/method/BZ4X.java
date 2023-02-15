package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 18:02
 * Detail（详情）：丰田BZ4X，电动车
 */
public class BZ4X implements ICar {
    @Override
    public void name() {
        System.out.println("丰田-BZ4X");
    }

    @Override
    public void price() {
        System.out.println("23.48w");
    }

    @Override
    public void kind() {
        System.out.println("电动汽车");
    }

    public void biggestContinueVoyageCourse(){
        System.out.println("最大续航：615km");
    }
}
