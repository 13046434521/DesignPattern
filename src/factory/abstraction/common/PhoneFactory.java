package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:10
 * @detail：具体实现工厂，手机工厂类
 */
class PhoneFactory extends Factory{
    @Override
    AppleProduct createApple() {
        return new Iphone();
    }

    @Override
    HWProduct createHW() {
        return null;
    }
}
