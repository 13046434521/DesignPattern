package factory.method.common;

/**
 * @author jtl
 * @date 2021/7/20 17:50
 * 具体工厂类
 */

class BYDFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BYD();
    }
}
