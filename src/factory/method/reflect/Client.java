package factory.method.reflect;


public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product productA = factory.createProduct(ConcreteProductA.class);
        Product productB = factory.createProduct(ConcreteProductB.class);

        productA.method();

        productB.method();
    }
}
