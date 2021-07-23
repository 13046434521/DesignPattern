package single;

/**
 * @author jtl
 * @date 2021/7/20 11:14
 * 饿汉式单例
 * 优点：线程安全的
 * 缺点：由于类加载时就会创建对象。从而会造成内存浪费。
 */

public class Hungry {
    private byte[] aaa = new byte[1024*1024*50];


    private Hungry(){
        System.out.println("饿汉式单例:"+Thread.currentThread().getName());
    }

    private static final Hungry sHungry = new Hungry();

    public static Hungry getInstance(){
        return sHungry;
    }

    public static void test(){
        System.out.println("我只是个静态方法");
    }
}
