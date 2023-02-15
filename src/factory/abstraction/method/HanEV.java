package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 17:39
 * Detail（详情）：比亚迪汉EV，电动车
 */
public class HanEV implements ICar {

    @Override
    public void name() {
        System.out.println("比亚迪-汉EV");
    }

    @Override
    public void price() {
        System.out.println("23w");
    }

    @Override
    public void kind() {
        System.out.println("电动汽车");
    }

    public void biggestContinueVoyageCourse(){
        System.out.println("最大续航：605km");
    }
}
