package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 20:43
 * Detail（详情）：动态代理客户端   分离代理行为与被代理类
 */
public class Client {
    public static void main(String[] args) {
        FaceSession faceSession = new FaceSession();



        IFaceDetect faceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                if (method.getName().equals("faceLiveness")) {
                    System.out.println("申请相机权限");
                    long tt = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceLiveness方法耗时：" + (System.currentTimeMillis() - tt));
                } else if (method.getName().equals("faceQuality")) {

                    System.out.println("申请相机权限");
                    long tt = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceQuality方法耗时：" + (System.currentTimeMillis() - tt));

                } else if (method.getName().equals("faceDetect")) {

                    System.out.println("申请相机权限");
                    long tt = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceDetect方法耗时：" + (System.currentTimeMillis() - tt));

                } else {

                }
                return obj;
            }
        });

        faceDetect.faceLiveness();
    }
}
