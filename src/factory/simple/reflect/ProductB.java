package factory.simple.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 12:30
 * @detail：具体产品类
 */
class ProductB implements Product{
    @Override
    public void method() {
        System.out.println("具体产品：ProductB");
    }
}
