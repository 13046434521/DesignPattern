package factory.simple.common;

/**
 * @author jtl
 * @date 2021/7/20 16:28
 */

class Client {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("比亚迪");
        car.name();
        car.price();
        car.kind();
    }
}
