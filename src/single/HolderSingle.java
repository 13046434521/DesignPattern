package single;

/**
 * @author jtl
 * @date 2021/7/20 11:49
 * 静态内部类单例
 * 优点：线程安全,因为类加载时是线程安全的
 * 缺点：反射可以破坏单例
 */

public class HolderSingle {
    private HolderSingle(){
        System.out.println("静态内部类单例："+Thread.currentThread().getName());
    }

    public static HolderSingle getInstance() {
        return Inner.sHolder;
    }

    private static class Inner{
        private static final HolderSingle sHolder = new HolderSingle();
    }
}
