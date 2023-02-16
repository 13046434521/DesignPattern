package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 20:43
 * Detail（详情）：
 */
public class Client {
    public static void main(String[] args) {
        IFaceDetect faceDetect = (IFaceDetect) Proxy.newProxyInstance(IFaceDetect.class.getClassLoader(), new Class[]{IFaceDetect.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return InvocationHandler.invokeDefault(proxy,method,args);
            }
        });

        faceDetect.faceLiveness();
    }
}
