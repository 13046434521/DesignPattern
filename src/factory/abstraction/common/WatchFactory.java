package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:11
 * @detail：具体实现工厂，手表工厂类
 */
class WatchFactory extends Factory{
    @Override
    AppleProduct createApple() {
        return new AppleWatch();
    }

    @Override
    HWProduct createHW() {
        return new HWWatch();
    }
}
