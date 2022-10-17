package factory.abstraction.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 18:19
 * @detail：抽象工厂类
 */
abstract class AbstractFactroy {
    abstract <T extends ProductA> T createProductA(Class<T> clazz);

    abstract <K extends ProductB> K createProductB(Class<K> clazz);

    abstract <J> J createProduct(Class<J> clazz);
}
