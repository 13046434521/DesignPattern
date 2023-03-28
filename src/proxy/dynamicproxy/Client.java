package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 20:43
 * Detail（详情）：动态代理客户端，分离代理行为与被代理类
 *               可以在不改变原有类的基础上，修改类中的方法行为
 */
public class Client {
    public static void main(String[] args) {
        FaceSession faceSession = new FaceSession();

        // 用来输出，动态代理类的对象
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        IFaceDetect timeFaceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new TimeInvocationHandler(faceSession));
        timeFaceDetect.faceLiveness();

        IFaceDetect permissionFaceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new PermissionInvocationHandler(faceSession));

        permissionFaceDetect.faceLiveness();
    }


    public static class TimeInvocationHandler implements InvocationHandler{
        IFaceDetect faceSession;

        public TimeInvocationHandler(IFaceDetect faceSession) {
            this.faceSession = faceSession;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object obj = null;
            switch (method.getName()){
                case "faceDetect":
                    long tt1 = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceDetect方法耗时：" + (System.currentTimeMillis() - tt1));
                    break;
                case "faceLiveness":
                    long tt2 = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceLiveness方法耗时：" + (System.currentTimeMillis() - tt2));
                    break;
                case "faceQuality":
                    long tt3 = System.currentTimeMillis();
                    obj = method.invoke(faceSession, args);
                    System.out.println("faceQuality方法耗时：" + (System.currentTimeMillis() - tt3));
                    break;
                default:
                    System.out.println("其他方法不计算时间："+method.getName());
                    obj = method.invoke(faceSession, args);
                    break;
            }

            return obj;
        }
    }

    public static class PermissionInvocationHandler implements InvocationHandler{
        IFaceDetect faceSession;

        public PermissionInvocationHandler(IFaceDetect faceSession) {
            this.faceSession = faceSession;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object obj = null;
            switch (method.getName()){
                case "faceDetect":
                    System.out.println("faceDetect：需要申请网络权限");
                    obj = method.invoke(faceSession, args);
                    break;
                case "faceLiveness":
                    System.out.println("faceLiveness：需要申请相机权限");
                    obj = method.invoke(faceSession, args);
                    break;
                case "faceQuality":
                    System.out.println("faceQuality：需要申请网络权限");
                    obj = method.invoke(faceSession, args);
                    break;
                default:
                    System.out.println("其他方法："+method.getName());
                    obj = method.invoke(faceSession, args);
                    break;
            }

            return obj;
        }
    }
}
