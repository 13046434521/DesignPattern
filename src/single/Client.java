package single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jtl
 * @date 2021/7/20 14:29
 * ����ģʽ����Test
 */

class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. ���߳�����µĲ��ԡ�
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(DCLSingle.getInstance().hashCode());
                System.out.println(LazySingle.getInstance().hashCode());
            }).start();
        }

        // 2. ����ʽռ����Դ����
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("����ʱ��"+(20-i));
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 2. ����ʽ
        Constructor<HolderSingle> holderConstructor = HolderSingle.class.getDeclaredConstructor();
        holderConstructor.setAccessible(true);
        HolderSingle holder = holderConstructor.newInstance(null);
        System.out.println(holder.hashCode() + "---" + HolderSingle.getInstance());

        // ����ö���൥�����޷�ͨ�������ȡ, Cannot reflectively create enum objects
        Constructor<EnumSingle> enumSingleConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);//ö�ٵĹ��캯�����вε�
        enumSingleConstructor.setAccessible(true);
        EnumSingle enumSingle = enumSingleConstructor.newInstance(null);
    }
}
