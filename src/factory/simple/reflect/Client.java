package factory.simple.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 12:31
 * @detail：客户端类
 */
class Client {
    public static void main(String[] args) {
        Product productA = Factory.createProduct(ProductA.class);
        Product productB = Factory.createProduct(ProductB.class);

        productA.method();
        productB.method();
    }
}
