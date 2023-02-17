package factory.abstraction.abstraction;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 17:39
 * Detail（详情）：抽象产品 混动汽车
 */
public interface IHEV {
    void name();
    void price();
    default void kind(){
        System.out.println("HEV（混动汽车）");
    }

    void fuelConsumption();

    default void detail(){
        System.out.println("-------分割线-------");
        name();
        kind();
        fuelConsumption();
        price();
    }
}
