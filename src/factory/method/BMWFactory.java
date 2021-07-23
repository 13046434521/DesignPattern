package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 17:52
 */

class BMWFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMW();
    }
}
