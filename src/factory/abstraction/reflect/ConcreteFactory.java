package factory.abstraction.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 18:34
 * @detail：
 */
class ConcreteFactory extends AbstractFactory {

    @Override
    <T extends ProductA> T createProductA(Class<T> clazz) {
        T t =null;
        try {
            t = (T) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return t;
    }

    @Override
    <K extends ProductB> K createProductB(Class<K> clazz) {
        K k =null;
        try {
            k = (K) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return k;
    }

    @Override
    <J> J createProduct(Class<J> clazz) {
        J j =null;
        try {
            j = (J) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return j;
    }
}
