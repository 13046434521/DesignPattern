package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 17:50
 */

class BYDFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BYD();
    }
}
