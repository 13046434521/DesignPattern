package factory.simple.common;

/**
 * @author jtl
 * @date 2021/7/20 16:26
 */

class BMW implements Car{
    @Override
    public void name() {
        System.out.println("宝马");
    }

    @Override
    public void price() {
        System.out.println("40万");
    }

    @Override
    public void kind() {
        System.out.println("燃油车");
    }
}
