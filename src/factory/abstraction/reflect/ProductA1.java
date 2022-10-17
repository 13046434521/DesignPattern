package factory.abstraction.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 18:42
 * @detail：具体实现类，种类A的第1种实现
 */
class ProductA1 extends ProductA{
    @Override
    void methodA() {
        System.out.println("ProductA的第1款产品");
    }
}
