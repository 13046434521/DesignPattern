package factory.simple.reflect;

/**
 * @author：TianLong
 * @date：2022/10/13 12:13
 * @detail：简单工厂类
 */
class Factory {
    /**
     * 通过反射的方式创建对象。通过泛型T来确定具体类型
     * @param clazz CLASS类
     * @return 返回值
     * @param <T> 泛型 T
     */
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
