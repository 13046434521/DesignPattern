package single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jtl
 * @date 2021/7/20 14:29
 * 单例模式测试Test
 */

class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 多线程情况下的测试。
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(DCL.getInstance().hashCode());
                System.out.println(Lazy.getInstance().hashCode());
            }).start();
        }

        // 2. 饿汉式占用资源测试
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("倒计时："+(20-i));
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Hungry.test();// 饿汉式单例的静态方法，没有调用getInstance()方法。



        // 2. 懒汉式
        Constructor<Holder> holderConstructor = Holder.class.getDeclaredConstructor();
        holderConstructor.setAccessible(true);
        Holder holder = holderConstructor.newInstance(null);
        System.out.println(holder.hashCode() + "---" + Holder.getInstance());

        // 测试枚举类单例，无法通过反射获取, Cannot reflectively create enum objects
        Constructor<EnumSingle> enumSingleConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);//枚举的构造函数是有参的
        enumSingleConstructor.setAccessible(true);
        EnumSingle enumSingle = enumSingleConstructor.newInstance(null);


    }
}
