package single;

/**
 * @author jtl
 * @date 2021/7/20 11:41
 * 懒汉式
 * 优点：不会造成内存浪费
 * 缺点：不加synchronized可能会造成线程安全问题
 *       加 synchronized 会造成性能浪费。
 *
 */

public class Lazy {
    private static Lazy sLazy ;

    private Lazy(){
        System.out.println("懒汉式："+Thread.currentThread().getName());
    }

    public static synchronized Lazy getInstance(){
        if (sLazy==null){
            sLazy = new Lazy();
        }

        return sLazy;
    }
}
