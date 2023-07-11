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

        IFaceDetect permissionFaceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                switch (method.getName()) {
                    case "faceLiveness":
                    case "faceQuality":
                        System.out.println("申请相机权限");
                        obj = method.invoke(faceSession, args);
                        break;

                    case "faceDetect":
                        System.out.println("申请网络权限");

                        obj = method.invoke(faceSession, args);

                        break;
                    default:

                        break;
                }
                return obj;
            }
        });


        IFaceDetect timeFaceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                switch (method.getName()) {
                    case "faceLiveness": {

                        long tt = System.currentTimeMillis();
                        obj = method.invoke(faceSession, args);
                        System.out.println("faceLiveness方法耗时：" + (System.currentTimeMillis() - tt));
                        break;
                    }
                    case "faceQuality": {

                        long tt = System.currentTimeMillis();
                        obj = method.invoke(faceSession, args);
                        System.out.println("faceQuality方法耗时：" + (System.currentTimeMillis() - tt));

                        break;
                    }
                    case "faceDetect": {

                        long tt = System.currentTimeMillis();
                        obj = method.invoke(faceSession, args);
                        System.out.println("faceDetect方法耗时：" + (System.currentTimeMillis() - tt));

                        break;
                    }
                    default:

                        break;
                }
                return obj;
            }
        });

        permissionFaceDetect.faceLiveness();

        timeFaceDetect.faceQuality();
    }
}
