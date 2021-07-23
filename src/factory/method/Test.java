package factory.method;

/**
 * @author jtl
 * @date 2021/7/20 17:48
 * 工厂方法模式
 */

class  Test {
    public static void main(String[] args) {
        CarFactory bydFactory = new BYDFactory();
        bydFactory.getCar().name();
        bydFactory.getCar().kind();
        bydFactory.getCar().price();
        System.out.println("--------------------");
        CarFactory bmwFactory = new BMWFactory();
        bmwFactory.getCar().name();
        bmwFactory.getCar().kind();
        bmwFactory.getCar().price();
    }
}
