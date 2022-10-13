package factory.simple.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 12:29
 * @detail：
 */
class ProductA implements Product{
    @Override
    public void method() {
        System.out.println("具体产品：ProductA");
    }
}
