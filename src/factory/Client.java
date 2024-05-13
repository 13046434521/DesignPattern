package factory;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 0:18
 * <p>
 * 描述：
 */

class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.buildProducts().printMsg();

        IFactory<Airport> airportFactory = new AirportFacroty();
        airportFactory.buildProducts().printMsg();
    }
}
