package factory.abstraction.common;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 17:39
 * Detail（详情）：抽象产品接口，电动汽车
 */
public interface IEV {
    void name();
    void price();
    default void kind(){
        System.out.println("EV 电动车");
    }

    void biggestContinueVoyageCourse();
    default void detail(){
        System.out.println("-------分割线-------");
        name();
        kind();
        biggestContinueVoyageCourse();
        price();
    }
}
