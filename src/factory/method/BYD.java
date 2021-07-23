package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 16:25
 */

class BYD implements Car {
    @Override
    public void name() {
        System.out.println("比亚迪");
    }

    @Override
    public void price() {
        System.out.println("22万");
    }

    @Override
    public void kind() {
        System.out.println("新能源");
    }
}
