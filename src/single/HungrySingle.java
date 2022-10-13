package single;

/**
 * @author jtl
 * @date 2021/7/20 11:14
 * 饿汉式单例
 * 优点：线程安全的
 * 缺点：由于类加载时就会创建对象。从而会造成内存浪费。
 */

public class HungrySingle {
    private byte[] aaa = new byte[1024*1024*50];

    private HungrySingle(){
    }

    private static final HungrySingle S_HUNGRY_SINGLE = new HungrySingle();

    public static HungrySingle getInstance(){
        return S_HUNGRY_SINGLE;
    }
}
