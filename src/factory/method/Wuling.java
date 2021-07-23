package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 16:21
 */

class Wuling implements Car {
    @Override
    public void name() {
        System.out.println("五菱宏光");
    }

    @Override
    public void price() {
        System.out.println("4万");
    }

    @Override
    public void kind() {
        System.out.println("新能源汽车");
    }
}
