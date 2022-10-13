package factory.method.common;

/**
 * @author jtl
 * @date 2021/7/20 17:48
 * 工厂方法模式
 */

class Client {
    public static void main(String[] args) {
        CarFactory bydFactory = new BYDFactory();
        Car bydCar=bydFactory.getCar();
        bydCar.name();
        bydCar.kind();
        bydCar.price();

        System.out.println("--------------------");
        CarFactory bmwFactory = new BMWFactory();
        Car bmwCar = bmwFactory.getCar();
        bmwCar.name();
        bmwCar.kind();
        bmwCar.price();
    }
}
