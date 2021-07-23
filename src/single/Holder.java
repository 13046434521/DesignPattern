package single;

/**
 * @author jtl
 * @date 2021/7/20 11:49
 * 静态内部类单例
 * 优点：线程安全
 * 缺点：反射可以破坏单例
 */

public class Holder {
    private Holder(){
        System.out.println("静态内部类单例："+Thread.currentThread().getName());
    }

    public static Holder getInstance() {
        return Inner.sHolder;
    }

    private static class Inner{
        private static final Holder sHolder = new Holder();
    }
}
