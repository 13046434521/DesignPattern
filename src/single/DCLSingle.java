package single;

/**
 * @author jtl
 * @date 2021/7/20 11:46
 * 双重检查模式单例
 * 优点：线程安全
 * 缺点：反射可以破坏单例
 * 注意：需加volatile，因为 new操作本身不是线程安全的。重排序会出现问题
 */

public class DCLSingle {
    private static volatile DCLSingle sDCLSingle;

    private DCLSingle() {
        System.out.println("双重检查模式：" + Thread.currentThread().getName());
    }

    public static DCLSingle getInstance() {
        if (sDCLSingle == null){
            synchronized (DCLSingle.class){
                if (sDCLSingle ==null){
                    sDCLSingle = new DCLSingle();
                }
            }
        }

        return sDCLSingle;
    }
}
