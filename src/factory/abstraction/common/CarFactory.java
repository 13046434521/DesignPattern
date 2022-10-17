package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:12
 * @detail：具体实现工厂，Car工厂
 */
class CarFactory extends Factory{
    @Override
    AppleProduct createApple() {
        return null;
    }

    @Override
    HWProduct createHW() {
        return new HWCar();
    }
}
