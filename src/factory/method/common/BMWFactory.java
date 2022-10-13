package factory.method.common;

/**
 * @author jtl
 * @date 2021/7/20 17:52
 * 具体工厂类
 */

class BMWFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMW();
    }
}
