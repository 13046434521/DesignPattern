package factory.abstraction.common;

/**
 * @author：TianLong
 * @date：2022/10/13 19:05
 * @detail：抽象工厂类
 */
abstract class Factory {
    abstract AppleProduct createApple();
    abstract HWProduct createHW();
}
