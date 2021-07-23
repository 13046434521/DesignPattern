package single;

/**
 * @author jtl
 * @date 2021/7/20 11:46
 * 双重检查模式单例
 * 优点：线程安全
 * 缺点：反射可以破坏单例
 * 注意：需加volatile，因为 new操作本身不是线程安全的。重排序会出现问题
 */

public class DCL {
    private static volatile DCL sDCL;

    private DCL() {
        System.out.println("双重检查模式：" + Thread.currentThread().getName());
    }

    public static DCL getInstance() {
        if (sDCL == null) {
            synchronized (DCL.class) {
                if (sDCL == null) {
                    //1.分配内存
                    //2.创建对象，初始化变量
                    //3.将对象指向内存地址
                    //java执行时，顺序可能是123也有可能是132。如果该类中有一个int a =10;的操作。
                    //多线程时可能造成 sDCL对象不为null，但是a尚未赋值还未0
                    sDCL = new DCL();
                }
            }
        }

        return sDCL;
    }
}
