package factory.abstraction.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 18:45
 * @detail：抽象工厂模式客户端
 */
class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        ProductA1 productA1 = factory.createProduct(ProductA1.class);
        ProductA2 productA2 = factory.createProduct(ProductA2.class);
        ProductB1 productB1 = factory.createProduct(ProductB1.class);
        ProductB2 productB2 = factory.createProduct(ProductB2.class);

        productA1.methodA();
        productA2.methodA();
        productB1.methodB();
        productB2.methodB();

    }
}
