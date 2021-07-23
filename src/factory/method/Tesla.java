package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 16:24
 */

class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }

    @Override
    public void price() {
        System.out.println("32万");
    }

    @Override
    public void kind() {
        System.out.println("新能源汽车");
    }
}
