package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 17:53
 */

class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
