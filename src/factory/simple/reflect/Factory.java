package factory.simple.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 12:13
 * @detail：简单工厂类
 */
class Factory {
    public static  <T extends Product> T createProduct(Class<T> clazz){
        T product=null;
        try {
            product = (T) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return product;
    }
}
