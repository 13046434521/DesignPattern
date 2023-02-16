package proxy.dynamicproxy;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/2/16 14:52
 * Detail（详情）：接口类
 */
public interface IFaceDetect {
    default void faceDetect() {
        // 模拟人脸检测耗时
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    default void faceLiveness() {
        // 模拟活体检测耗时
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    default void faceQuality() {
        // 模拟质量评估耗时
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
