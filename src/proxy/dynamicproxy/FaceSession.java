package proxy.dynamicproxy;

import proxy.dynamicproxy.IFaceDetect;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/17 12:35
 * Detail（详情）：
 */
public class FaceSession implements IFaceDetect {
    public void init(){
        System.out.println("人脸算法初始化");
    }

    @Override
    public void faceDetect() {
        // 模拟人脸检测耗时
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void faceLiveness() {
        // 模拟活体检测耗时
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void faceQuality() {
        // 模拟质量评估耗时
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void release(){
        System.out.println("人脸算法释放");
    }
}
