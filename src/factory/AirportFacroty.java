package factory;

/**
 * 作者：jtl
 * <p>
 * 日期：Created in 2023/7/19 0:21
 * <p>
 * 描述：
 */

class AirportFacroty implements IFactory<Airport> {
    @Override
    public Airport buildProducts() {
        return new Airport();
    }
}
