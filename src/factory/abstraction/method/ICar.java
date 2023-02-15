package factory.abstraction.method;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/14 17:39
 * Detail（详情）：抽象产品
 */
public interface ICar {
    void name();
    void price();
    void kind();

    default void detail(){
        System.out.println("-------分割线-------");
        name();
        kind();
        price();
    }
}
